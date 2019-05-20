$(function () {
    //Al cargar la página recuperamos el listado de clientes
    $.getJSON("/clientes",
        function (data) {
        //Por cada uno creamos una fila de HTML
            $.each(data, function (key, val) {
                var fila = "<tr><td>" + val.DNI + "</td><td><a href='#' onclick='cargarDetalle(event,\"" + val.DNI + "\");'>Ver Detalle</a></td></tr>";
                //Añadimos la fila a la tabla
                $(fila).appendTo("#tablaClientes");
             });
        });
});

