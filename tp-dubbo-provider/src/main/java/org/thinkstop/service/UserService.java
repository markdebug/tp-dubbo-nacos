package org.thinkstop.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.thinkstop.common.api.IUserService;

/**
 * @author huating
 * @Title: //TODO
 * @ProjectName tp-dubbo-nacos
 * @Description: TODO
 * @date 2019/8/6 13:57
 */

@Service(version = "${demo.service.version}")
public class UserService implements IUserService {
    @Override
    public String queryName(String name) {
        return "查询的名字是" + name;
    }
}
