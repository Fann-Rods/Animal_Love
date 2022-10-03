$(document).ready(function () {

    $("#form-login").submit(function (event) {
        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });


});

function autenticarUsuario() {

    let username = $("#id_usuario").val();
    let contrasena = $("#contrasenia").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            username: username,
            contrasena: contrasena
        }),
        success: function (result) {
            
            let parsedResult = JSON.parse(result);
            console.log(parsedResult);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let username = parsedResult['id_usuario'];
                document.location.href = "mascotas_dog.html?username=" + username;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarUsuario() {

    let username = $("#input-id_usuario").val();
    let contrasena = $("#input-contrasenia").val();
    let contrasenaConfirmacion = $("#input-contrasenia-repeat").val();
    let tipoDocumento = $("#input-tipo_documento").val();
    let nombre = $("#input-nombre").val();
    let apellido = $("#input-apellido").val();
    let telefono = $("#input-telefono").val();
    let email = $("#input-email").val();
    let departamento = $("#input-departamento").val();
    let ciudad = $("#input-ciudad").val();

    if (contrasena === contrasenaConfirmacion) {
        console.log(username + " " + contrasena + " " + tipoDocumento + " " + nombre + " " + apellido + " " + telefono + " " + email + " " + departamento + " " + ciudad);
        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({
                username: username,
                contrasena: contrasena,
                tipo_documento: tipoDocumento,
                nombre: nombre,
                apellido: apellido,
                telefono: telefono,
                email: email,
                departamento: departamento,
                ciudad: ciudad
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let username = parsedResult['id_usuario'];
                    document.location.href = "mascotas_dog.html?username=" + username;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        console.log('No está ingresando');
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}



