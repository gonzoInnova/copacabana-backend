"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class CopacabanaController {
    index(req, res) {
        res.json({ text: 'API is in /api/games' });
    }
}
const copacabanaController = new CopacabanaController;
exports.default = copacabanaController;
