"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const copacabanaController_1 = require("../controllers/copacabanaController");
class CopacabanaRoutes {
    constructor() {
        this.router = (0, express_1.Router)();
        this.config();
    }
    config() {
        this.router.get('/', copacabanaController_1.copacabanaController.index);
    }
}
const copacabanaRoutes = new CopacabanaRoutes();
exports.default = copacabanaRoutes.router;
