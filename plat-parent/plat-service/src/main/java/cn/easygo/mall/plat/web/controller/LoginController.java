package cn.easygo.mall.plat.web.controller;

import cn.easygo.mall.basic.util.AjaxResult;
import cn.easygo.mall.plat.domain.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/***
 * @ClassName: EmployeeController
 * @Description:
 * @Auther: glw
 * @Date: 2019/1/27 9:33
 * @version : V1.0
 */

@RestController
@RequestMapping
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword()))
            return AjaxResult.getInstance().setSuccess(true).setMessage("登录成功！");
        return AjaxResult.getInstance().setSuccess(false).setMessage("用户名或密码错误！");
    }
}
