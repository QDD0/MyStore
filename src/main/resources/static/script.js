function scrollCarousel(direction) {
    const carousel = document.querySelector('.carousel');
    carousel.scrollBy({ left: direction * 215, behavior: 'smooth' });
}