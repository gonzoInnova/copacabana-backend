import { Request, Response } from 'express';

class CopacabanaController {

    public index(req: Request, res: Response) {
        res.json({text: 'API is in /api/games'});
    }

}

const copacabanaController = new CopacabanaController;
export default copacabanaController;