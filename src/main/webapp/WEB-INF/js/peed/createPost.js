/**
 * 포스트 생성 페이지에서 필요한 javascript 코드
 * 업로드 파일 유효성 검사
 * 	1. 동영상과 이미지 파일은 함께 게시할 수 없다.
 * 	2. 동영상 파일은 최대 1개까지 업로드할 수 있다.
 * 	3. 이미지 파일은 최대 5개까지 업로드할 수 있다.
 */

const textareaDiv = document.querySelector('.textarea_container');
const addActionDiv = document.querySelector('.img_container');
const uploadFiles = [];

function imgPreview(e) {
	
	const files = e.currentTarget.files;
	
//	유효성 검사 및 ul 생성 코드
	if(document.querySelector('.preview_img') == null){
		if ([...files].length >= 6) { //file 개수 확인
			alert('최대 5개의 이미지 파일만 업로드가 가능합니다.');
			return;
		} 
//		파일 타입 검사
		for(let i=0; i<[...files].length; i++){
			if (![...files][i].type.match("image/*")) {
				if(![...files][i].type.match("video/*")){
					alert('이미지 파일만 업로드가 가능합니다.');
					return	
				}
				alert('이미지 파일만 업로드가 가능합니다.');
				return	
			}
			uploadFiles.push([...files][i]);
		}
		//최초 이미지 업로드 시 ul 생성
		let ul = document.createElement('ui');
		ul.className = 'preview_img';
		textareaDiv.after(ul); 
	} else{ 
		if ((document.getElementsByClassName('preview_img')[0].childElementCount + [...files].length) >= 6) {
			alert('이미지는 최대 5개 까지 업로드가 가능합니다.');
			return;
		} 
//		파일 타입 검사
		for(let i=0; i<[...files].length; i++){
			if (![...files][i].type.match("image/*")) {
				if(![...files][i].type.match("video/*")){
					alert('이미지 파일만 업로드가 가능합니다.');
					return	
				}
				alert('이미지 파일만 업로드가 가능합니다.');
				return	
			}
			uploadFiles.push([...files][i]);
			console.log([...files][i]);
		}
	}
	
	let ul = document.getElementsByClassName('preview_img')[0];
	// 프리뷰를 위한 코드
	[...files].forEach(file => {
		const reader = new FileReader();
		reader.onload = (e) => {
			const preview = createImgLi(e, file);
			ul.appendChild(preview);
		};
		reader.readAsDataURL(file);
	});
	
//	************************************************************************
//	chk uploadFiles 리스트 변수는 이후 ajax요청 넣을 때 사용할 예정.
	if(uploadFiles.length > 0){
		for(let i=0; i<uploadFiles.length; i++)
			console.log(i + '번째 파일명 : ' + uploadFiles[i].name )
	}
//	************************************************************************
	
}
//	이미지 프리뷰 실행은 위해 img가 포함된 li 태그를 생성하는 함수
function createImgLi(e, file){
	const li = document.createElement('li');
	const img = document.createElement('img');
	img.setAttribute('src', e.target.result);
	img.setAttribute('data-file', file.name);
	li.appendChild(img);
	return li;
}

function previewVideo(e) {
	const videoFile = videoUpload.files[0];
	const div = document.createElement('div');
	div.className  = 'preview_video';
	textareaDiv.after(div); 

	//파일 타입 검사
	if(!videoFile.type.match("video/*")){
		document.getElementsByClassName('preview_video')[0].remove();
		alert('비디오 파일만 업로드 가능합니다.');
		return
	}
	const videourl = URL.createObjectURL(videoFile);
	const preview = createVideoElement(e, videoFile);
	preview.setAttribute("src", videourl);
	div.append(preview);
	setTimeout(() => preview.play(), 600);
}
//	비디오 프리뷰 실행을 위해 video 태그를 생성하는 함수.
function createVideoElement(e, videoFile){
	const video = document.createElement('video');
	video.setAttribute('src', e.target.result);
	video.setAttribute('data-file', videoFile.name);
	video.setAttribute("controls", 'controls');
	video.id = 'video';
	return video;
}





// 이벤트 및 실행 내용 

const imgIcon = document.querySelector('.icon_upload_img');	//img _클릭시 input 파일 선택
const videoIcon = document.querySelector('.icon_upload_video');	//img _클릭시 input 파일 선택 

// 이미지 파일 업로드 이벤트
imgIcon.addEventListener('click', () => {
	
	if(document.querySelector('.video-upload') !== null){
		alert('이미지와 동영상은 함께 게시할 수 없습니다.');
		return;
	}
	//이미지아이콘 최초 클릭시 input 태그 생성
	if(document.querySelector('.img-upload') == null){
		var input = document.createElement("input");
		input.type = 'file';
		input.className = 'img-upload';
		input.accept= 'image/*';
		input.setAttribute('name', 'images');
		input.setAttribute('required', true);
		input.setAttribute('multiple', true);
		imgIcon.after(input);
	} 
	imgUpload = document.querySelector('.img-upload');
	imgUpload.click();
	imgUpload.addEventListener('change', imgPreview);	//파일 추가시 프리뷰 이미지 띄우기
});
	
// 동영상 아이콘 클릭 시 input click, getVideoFile로 프리뷰
videoIcon.addEventListener('click', () => {
	
	if(document.querySelector('.img-upload') !== null){
		alert('이미지와 동영상은 함께 게시할 수 없습니다.');
		return;
	}
	//동영상아이콘 최초 클릭시 input 태그 생성
	if(document.querySelector('.video-upload') == null){
		var input = document.createElement("input");
		input.type = 'file';
		input.className = 'video-upload';
		input.accept= 'video/*';
		input.setAttribute('name', 'video');
		input.setAttribute('required', true);
		videoIcon.after(input);
	}else if (document.querySelector('.video-upload') != null){
		alert('동영상 파일은 최대 1개까지만 업로드할 수 있습니다.');
		return
	}
	videoUpload = document.querySelector('.video-upload');
	videoUpload.click(); 
	videoUpload.addEventListener('change', previewVideo);	//파일 추가시 프리뷰 영상 띄우기
	
});

function tagSomeone() { // addEventListener를 사용한 코드로 변경 예정 
	console.log('open the modal for tagging someone.')
}


// ajax로 파일에 대한 실업로드와 db 데이터 입력에 대한 코드


