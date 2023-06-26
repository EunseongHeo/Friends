/**
 * 
 */

var slideWrapper = document.querySelector('.img_container');
var slides = document.querySelectorAll('.img_item');
var totalSlides = slides.length; // img_item의 갯수
console.log(totalSlides + " totalSlides값");


var sliderWidth = slideWrapper.clientWidth; // img_container의 width
console.log(sliderWidth + " sliderWidth값");
var slideIndex = 0;
var slider = document.querySelector('.slider');

slider.style.width = sliderWidth * totalSlides + 'px';


function showSlides(n) {
    slideIndex = n;
    console.log(n + " : n");
    if (slideIndex == -1) {
        slideIndex = totalSlides - 1;
    } else if (slideIndex === totalSlides) {
        slideIndex = 0;
    }
    slider.style.left = -(sliderWidth * slideIndex) + 'px';
}

function plusSlides(n){
    showSlides(slideIndex += n);
}
  
function currentSlide(n) {
    showSlides(slideIndex = n);
}

var nextBtn = document.querySelector('.next');
var prevBtn = document.querySelector('.prev');

nextBtn.addEventListener('click', function () {
    plusSlides(1);
});
prevBtn.addEventListener('click', function () {
    plusSlides(-1);
});