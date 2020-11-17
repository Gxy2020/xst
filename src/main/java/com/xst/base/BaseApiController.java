package com.xst.base;

import com.xst.context.WebContext;
import com.xst.domain.User;
import com.xst.utility.ModelMapperSingle;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author GUO
 * @Classname BaseApiController
 * @Description TODO
 * @Date 2020/11/16 20:28
 */
public class BaseApiController {
    protected final static String DEFAULT_PAGE_SIZE = "10";
    protected final static ModelMapper modelMapper = ModelMapperSingle.Instance();
    @Autowired
    protected WebContext webContext;

    protected User getCurrentUser() {
        return webContext.getCurrentUser();
    }
}
