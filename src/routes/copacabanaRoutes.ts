import {Router} from 'express'
import {copacabanaController} from '../controllers/copacabanaController'
class CopacabanaRoutes {
 public router: Router= Router();
 constructor(){
this.config()
 }
 config():void{
    this.router.get('/',copacabanaController.index)
 }
}
const copacabanaRoutes =new CopacabanaRoutes();
export default copacabanaRoutes.router