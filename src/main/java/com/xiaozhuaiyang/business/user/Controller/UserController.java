package com.xiaozhuaiyang.business.user.Controller;

import com.xiaozhuaiyang.business.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: zglai
 * Date:22:35 2021/5/13
 * @Description:<描述>
 */
@RestController
@RequestMapping("")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("")
    public String getUserList() {
       /* List<SysUser> list = sysUserService.getUserList();
        return JSONObject.toJSONString(list);*/
        System.out.println("这是8081端口~");
        return "这是8081端口~";
    }

    @GetMapping("/getUserById")
    public Object getUserById(){
        ExecutorService executorService = Executors.newFixedThreadPool(16);
        for(int i=0;i<100;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    sysUserService.getSysUser("1");
                }
            });
        }
        return sysUserService.getSysUser("1");
    }
}
