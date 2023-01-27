package com.copacabana.copacabana.exception;

public enum MessageDescription {
    // General 0-50
    stateNullOrEmpty,
    stateNotValid,
    ValidacionCampoVacioNulo,
    trayNullOrEmpty,
    trayNotValid,
    executiveNullOrEmpty,
    typeShippingNullOrEmpty,
    tokenNullOrEmpty,
    objectNull,
    integrationErrorValidation,
    missingIntegration,
    actionNotValid,

    // Entitys 101-150
    repeated,
    notExists,
    EntityDuplicated,
    NombreDuplicado,
    CodigoDuplicado,
    EstadoNoValido,
    ActionNoValida,
    tiponoValido,
    trayNotUpdatable,
    sameTray,
    missingDataArchivedTray,
    sameExecutive,
    tooMuchDataTray,
    externalMessageNullOrEmpty,
    requestNotArchived,
    entityNotValid,
    sameState,
    missingApprovedData,
    differentExecutive,
    assignAgencyNotValid,
    passwordNotExists,
    incompleteDataToPassword,


    // Carga Masiva 151-200
    CSVNoValido,
    FechaNoValido,
    DatosNoValidos,
    DatosDuplicados,
    DatosExistentes,
    TamanioNoValido,
    SaldoNegativo,
    ImporteDescuentoNegativo,
    DiasNegativo,

    // contraseñas  251-300
    ContraseniaIncorrecta,

    // Usuarios 301-350
    UsernameNoEncontrado,
    UsernameDuplicado,
    UserWithoutRoles,
    UserWithoutResources,
    UserWithoutPermissions,
    UserAccessDenied,


    // Encuestas 351 - 400
    PreguntaNoValida,
    TipoNoValido,
    LugarInvalido,
    Base64NotValid,
    Base64Null,
    Base64Int,
    Base64DatosError,

    // Eventos 401 - 450
    EventoFechaNoValido,
    EventoPeriodoNoValido,

    // Reportes 451 - 500
    ReporteGeneracionError,
    ZipGenerationError,
    DocumentUploadError,

    // Encuestas 501 - 550
    ReporteNoValido,
    ReportePlantillaNoValido,
    ReportePlantillaMapaNoValido,
    UserUnauthorized,
    UserNotFound
}
