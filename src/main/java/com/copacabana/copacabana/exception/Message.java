package com.copacabana.copacabana.exception;

import java.util.Map;
import java.util.TreeMap;

public class Message {
    private final static Map<MessageDescription, ExceptionResponse> vMessageTypes = new TreeMap<MessageDescription, ExceptionResponse>(){{
        // General 0-50
        put(MessageDescription.ValidacionCampoVacioNulo, new ExceptionResponse("1","El valor del campo [%s] no puede ser vacío o nulo.", "detalle -_-"));
        put(MessageDescription.stateNullOrEmpty, new ExceptionResponse("2","El estado consultado no puede ser vacío o nulo.", "detalle -_-"));
        put(MessageDescription.stateNotValid, new ExceptionResponse("4","El estado consultado %s no es permitido.", "detalle -_-"));
        put(MessageDescription.trayNullOrEmpty, new ExceptionResponse("5","La bandeja consultada no puede ser vacía o nula.", "detalle -_-"));
        put(MessageDescription.trayNotValid, new ExceptionResponse("6","La bandeja consultada %s no es permitida.", "detalle -_-"));
        put(MessageDescription.executiveNullOrEmpty, new ExceptionResponse("7","El ejecutivo no puede ser vacío o nulo.", "detalle -_-"));
        put(MessageDescription.typeShippingNullOrEmpty, new ExceptionResponse("8", "El tipo de envio no puede ser nulo", "detalle -_-"));
        put(MessageDescription.tokenNullOrEmpty, new ExceptionResponse("9", "El tipo de token no puede ser nulo", "detalle -_-"));
        put(MessageDescription.objectNull, new ExceptionResponse("10", "%s no puede ser nulo", "detalle -_-"));
        put(MessageDescription.integrationErrorValidation, new ExceptionResponse("11", "%s no se pudo realizar correctamente", "detalle -_-"));
        put(MessageDescription.actionNotValid, new ExceptionResponse("12", "Acción inválida [%s].", "detalle -_-"));
        // Entitys 101-150
        put(MessageDescription.repeated, new ExceptionResponse("101","Existe un registro activo con el %s: %s", "detalle -_-"));
        put(MessageDescription.notExists, new ExceptionResponse("102","No se encontró %s con el %s: %s", "detalle -_-"));
        put(MessageDescription.NombreDuplicado, new ExceptionResponse("103","El [%s] con nombre [%s] ya esta registrado", "detalle -_-"));
        put(MessageDescription.CodigoDuplicado, new ExceptionResponse("104","El [%s] con código [%s] ya esta registrado", "detalle -_-"));
        put(MessageDescription.EstadoNoValido, new ExceptionResponse("105","El estado [%s] no es valido.", "detalle -_-"));
        put(MessageDescription.ActionNoValida, new ExceptionResponse("106","La acción [%s] no es valida.", "detalle -_-"));
        put(MessageDescription.TipoNoValido, new ExceptionResponse("107","La tipo [%s] no es valido.", "detalle -_-"));
        put(MessageDescription.trayNotUpdatable, new ExceptionResponse("108","La bandeja %s no puede ser modificada/reasignada.", "detalle -_-"));
        put(MessageDescription.sameTray, new ExceptionResponse("109","La solicitud ya se encuentra en la bandeja %s.", "detalle -_-"));
        put(MessageDescription.missingDataArchivedTray, new ExceptionResponse("110","Se requiere enviar motivo/observacion para Archivar la solicitud.", "detalle -_-"));
        put(MessageDescription.sameExecutive, new ExceptionResponse("111","La solicitud ya se encuentra asignada al ejecutivo", "detalle -_-"));
        put(MessageDescription.tooMuchDataTray, new ExceptionResponse("112","La bandeja %s no requiere motivo/observación", "detalle -_-"));
        put(MessageDescription.externalMessageNullOrEmpty, new ExceptionResponse("113", "Se requiere mensaje de respuesta de abstracta", "detalle -_-"));
        put(MessageDescription.requestNotArchived, new ExceptionResponse("114", "La bandeja %s no puede ser DESARCHIVADA", "detalle -_-"));
        put(MessageDescription.entityNotValid, new ExceptionResponse("115", "El objeto %s no puede ser nulo", "detalle -_-"));
//        put(MessageDescription.sameExecutive, new CyCOExceptionResponse("115","La solicitud ya se encuentra en el estado %s", "detalle -_-"));
        put(MessageDescription.missingApprovedData, new ExceptionResponse("116","Existen observaciones en la solicitud, no es posible modificar la bandeja a %s", "detalle -_-"));
        put(MessageDescription.differentExecutive, new ExceptionResponse("117","La solicitud se encuentra asignada a otro ejecutivo, no es posible modificar la bandeja", "detalle -_-"));
        put(MessageDescription.assignAgencyNotValid, new ExceptionResponse("118","No se puede realizar la asignacion de agencia %s, agencia asignada al canal digital %s", "detalle -_-"));
        put(MessageDescription.passwordNotExists, new ExceptionResponse("119","No se encontró  datos para generar el password", "detalle -_-"));
        put(MessageDescription.incompleteDataToPassword, new ExceptionResponse("120","Mo se encontró la primera o segunda parte para generar el password", "detalle -_-"));

        // Carga Masiva 151-200
        put(MessageDescription.CSVNoValido, new ExceptionResponse("151","El CSV no es valido.", "detalle -_-"));
        put(MessageDescription.DatosNoValidos, new ExceptionResponse("152","Existen datos que no son validos, Datos: [%s] .", "detalle -_-"));
        put(MessageDescription.DatosDuplicados, new ExceptionResponse("153","Existen datos duplicados en el CSV, Datos: [%s] .", "detalle -_-"));
        put(MessageDescription.DatosExistentes, new ExceptionResponse("154","Existen datos ya registrados en el CSV, Datos: [%s] .", "detalle -_-"));
        put(MessageDescription.FechaNoValido, new ExceptionResponse("155","El formato de fechas no es válido. Usar dd-mm-yyyy.", "detalle -_-"));
        put(MessageDescription.TamanioNoValido, new ExceptionResponse("156","Las dimensiones de la imagen deben ser [%d]px X [%d]px", "detalle -_-"));
        put(MessageDescription.SaldoNegativo, new ExceptionResponse("157","Los saldos RC-IVA no pueden ser valores negativos", "detalle -_-"));
        put(MessageDescription.ImporteDescuentoNegativo, new ExceptionResponse("158","Los importes de descuento no pueden ser valores negativos", "detalle -_-"));
        put(MessageDescription.DiasNegativo, new ExceptionResponse("159","El total de días no puede ser un valor negativos", "detalle -_-"));

        // contraseñas  251-300
        put(MessageDescription.ContraseniaIncorrecta, new ExceptionResponse("251","Contraseña incorrecta.", "detalle -_-"));
        // Usuarios 301-350
        put(MessageDescription.UsernameNoEncontrado, new ExceptionResponse("301","El username [%s] no se encuentra registrado.", "detalle -_-"));
        put(MessageDescription.UserWithoutRoles, new ExceptionResponse("302","Error en el Login: usuario no tiene rols asignados", "detalle -_-"));
        put(MessageDescription.UserWithoutResources, new ExceptionResponse("304","Error en el Login: usuario no tiene menúes asignados", "detalle -_-"));
        put(MessageDescription.UserWithoutPermissions, new ExceptionResponse("305","Error en el Login: usuario no tiene permisos asignados", "detalle -_-"));
        put(MessageDescription.UsernameDuplicado, new ExceptionResponse("306","El [%s] con username [%s] ya esta registrado", "detalle -_-"));
        put(MessageDescription.UserAccessDenied, new ExceptionResponse("307","Accesos denegado al token.", "detalle -_-"));
        // Encuestas 351 - 400
        put(MessageDescription.PreguntaNoValida, new ExceptionResponse("351","No se puede agregar posibles respuestas a las preguntas simples.", "detalle -_-"));
        put(MessageDescription.TipoNoValido, new ExceptionResponse("352","El tipo banner [%s] solo permite un banner activo.", "detalle -_-"));
        put(MessageDescription.LugarInvalido, new ExceptionResponse("354","El lugar no puede ser nulo.", "detalle -_-"));
        put(MessageDescription.Base64NotValid, new ExceptionResponse("353","Archivo base 64 no válido.", "detalle -_-"));
        put(MessageDescription.Base64Null, new ExceptionResponse("354","Error al analizar CSV, linea: [%s].", "detalle -_-"));
        put(MessageDescription.Base64Int, new ExceptionResponse("355","El total de días solo admite números enteros", "detalle -_-"));
        put(MessageDescription.Base64DatosError, new ExceptionResponse("356","Los datos en el csv son incorrectos", "detalle -_-"));
        // Eventos 401 - 450
        put(MessageDescription.EventoFechaNoValido, new ExceptionResponse("401","Rango de fechas no valido: %s - %s", "detalle -_-"));
        put(MessageDescription.EventoPeriodoNoValido, new ExceptionResponse("402","Periodo no valido: %s - %s", "detalle -_-"));
        // Reportes 451 - 500
        put(MessageDescription.ReporteGeneracionError, new ExceptionResponse("451","No se puede generar el reporte %s en formato %s", "detalle -_-"));
        put(MessageDescription.ZipGenerationError, new ExceptionResponse("452","No se puede generar el archivo comprimido para %s con %s: %s", "detalle -_-"));
        put(MessageDescription.DocumentUploadError, new ExceptionResponse("453","No se puede cargar el documento %s", "detalle -_-"));
        // Encuestas 501 - 550
        put(MessageDescription.ReporteNoValido, new ExceptionResponse("501","No se puede registrar el reporte", "detalle -_-"));
        put(MessageDescription.ReportePlantillaNoValido, new ExceptionResponse("502","No se puede registrar la plantilla del reporte", "detalle -_-"));
        put(MessageDescription.ReportePlantillaMapaNoValido, new ExceptionResponse("503","No se puede registrar los campos de la plantilla", "detalle -_-"));
        put(MessageDescription.UserUnauthorized, new ExceptionResponse("777","Usuario no autorizado", "detalle -_-"));
        put(MessageDescription.UserNotFound, new ExceptionResponse("778","Usuario no encontrado", "detalle -_-"));

    }};

    public static BadRequestException GetBadRequest(MessageDescription vMessageDescription, String value)
    {
        ExceptionResponse vMessageDetail = vMessageTypes.get(vMessageDescription);
        String vNewMessage = vMessageDetail.getMessage();
        vNewMessage = String.format(vNewMessage, value);
        return new BadRequestException(vMessageDetail.getCode(), vNewMessage);
    }

    public static BadRequestException GetBadRequest(MessageDescription tipo)
    {
        ExceptionResponse vMessageDetail = vMessageTypes.get(tipo);
        String vNewMessage = vMessageDetail.getMessage();
       return new BadRequestException(vMessageDetail.getCode(), vNewMessage);
    }
    public static UnauthorizedException GetUnauthorized(MessageDescription tipo)
    {
        ExceptionResponse vMessageDetail = vMessageTypes.get(tipo);
        String vNewMessage = vMessageDetail.getMessage();
        return new UnauthorizedException(vMessageDetail.getCode(), vNewMessage);
    }
    public static NotFoundException GetNotFound(MessageDescription tipo)
    {
        ExceptionResponse vMessageDetail = vMessageTypes.get(tipo);
        String vNewMessage = vMessageDetail.getMessage();
        return new NotFoundException(vMessageDetail.getCode(), vNewMessage);
    }
    public static BadRequestException GetBadRequest(MessageDescription pMessageDescription, Object[] pArgs)
    {
        ExceptionResponse vMessageDetail = vMessageTypes.get(pMessageDescription);
        String vNewMessage = vMessageDetail.getMessage();
        vNewMessage = String.format(vNewMessage, pArgs);
        return new BadRequestException(vMessageDetail.getCode(), vNewMessage);
    }
    public static NotFoundException GetNotFound(MessageDescription pMessageDescription, Object[] pArgs)
    {
        ExceptionResponse vMessageDetail = vMessageTypes.get(pMessageDescription);
        String vNewMessage = vMessageDetail.getMessage();
        vNewMessage = String.format(vNewMessage, pArgs);
        return new NotFoundException(vMessageDetail.getCode(), vNewMessage);
    }

    public static NotFoundException GetNotFound(MessageDescription pMessageDescription, String pArgs)
    {
        ExceptionResponse messageDetail = vMessageTypes.get(pMessageDescription);
        String newMessage = messageDetail.getMessage();
        newMessage = String.format(newMessage, pArgs);
        return new NotFoundException(messageDetail.getCode(), newMessage);
    }
}
