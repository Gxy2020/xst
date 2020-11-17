package com.xst.viewmodel.admin.user;


import com.xst.base.BasePage;
import lombok.Data;

/**
 * @author GUO
 */

@Data
public class UserPageRequestVM extends BasePage {

    private String userName;
    private Integer role;

}
