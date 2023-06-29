/**
 * 포스트 생성 페이지에서 필요한 javascript 코드
 */

function onSubmit() {
	console.log('clicked submit.');
}




const textareaDiv = document.querySelector('.textarea_container');
const addActionDiv = document.querySelector('.img_container');

function imgPreview(e) {
	
	// li 개수를 파악하여 이미 5개의 li 가 존재한다면 alert('이미지는 최대 5개까지 업로드 가능합니다.') 후 return하는 코드 (필요)
	const uploadFiles = [];
	const files = e.currentTarget.files;
	console.log(files);
	console.log(files.length);
	
// 해결요망
// 문제1. 이미지 파일을 추가한 후 또 추가할 때 새로운 ui 생성
// 문제2. 최대 이미지 파일 개수가 5이나, 여러 번에 나누어 추가 하는 경우 5개 이상도 추가할 수 있음.
	
	//ul 태그 생성 및 원하는 위치에 배치
	const ul = document.createElement('ui');
	ul.className = 'preview_img';
	textareaDiv.after(ul); //chk
	
	if ([...files].length >= 6) {
		document.getElementsByClassName('preview_img')[0].remove();
		alert('이미지는 최대 5개 까지 업로드가 가능합니다.');
		return;
	} else if ([...files].length ==0) {
		document.getElementsByClassName('preview_img')[0].remove();
	}
	
	// 파일 타입 검사
	[...files].forEach(file => {
		if (!file.type.match("image/.*")) {
			document.getElementsByClassName('preview_img')[0].remove();
			alert('이미지 파일만 업로드가 가능합니다.');
			return	
		}
		// 파일 갯수 검사
		if ([...files].length < 6) {
			uploadFiles.push(file);
			const reader = new FileReader();
			reader.onload = (e) => {
				const preview = createImgLi(e, file);
				ul.appendChild(preview);
			};
			reader.readAsDataURL(file);
		}
	});
	
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
	textareaDiv.after(div); //chk

// 해결요망
// 문제1. 비디오 파일을 추가한 후 또 추가가 가능함.
// 문제2. 이미지 파일을 추가한 경우에도 비디오 파일 추가가 가능함.
	
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
	
}


function createVideoElement(e, videoFile){
	
	const video = document.createElement('video');
	video.setAttribute('src', e.target.result);
	video.setAttribute('data-file', videoFile.name);
	video.setAttribute("controls", 'controls');
	video.id = 'video';
	return video;
}



const imgIcon = document.querySelector('.icon_upload_img');	//img _클릭시 input 파일 선택
const videoIcon = document.querySelector('.icon_upload_video');	//img _클릭시 input 파일 선택 
const imgUpload = document.querySelector('.img-upload'); //input
const videoUpload = document.querySelector('.video-upload'); //input 

// 이미지 추가 작업에 대한 코드
imgIcon.addEventListener('click', () => { imgUpload.click(); });	//이미지 아이콘 클릭시 input 클릭이벤트
imgUpload.addEventListener('change', imgPreview);	//파일 추가시 프리뷰 이미지 띄우기

// 동영상 아이콘 클릭 시 input click, getVideoFile로 프리뷰
videoIcon.addEventListener('click', () => { videoUpload.click(); });	//동영상 아이콘 클릭시 input 클릭이벤트
videoUpload.addEventListener('change', previewVideo);	//파일 추가시 프리뷰 영상 띄우기

function tagSomeone() {
	console.log('open the modal for tagging someone.')
}

