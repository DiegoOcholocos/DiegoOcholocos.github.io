
function toggleNavTrigger() {
    if ($(window).width() < 768) {
        $('.vf-navTrigger').show();
    } else {
        $('.vf-navTrigger').hide();
    }
}

$(document).ready(function () {
    toggleNavTrigger(); // Ejecutar al cargar la página

    // Manejar el clic en el botón de menú
    $('.vf-navTrigger').click(function () {
        $(this).toggleClass('active');
        console.log("Clicked menu");
        $("#vf-mainListDiv ul").toggleClass("show_list"); // Cambiado para seleccionar la lista ul
        $("#vf-mainListDiv ul").fadeIn(); // Cambiado para seleccionar la lista ul
    });

    // Manejar el redimensionamiento de la ventana
    $(window).resize(function () {
        toggleNavTrigger(); // Volver a verificar al redimensionar la ventana
    });
});
