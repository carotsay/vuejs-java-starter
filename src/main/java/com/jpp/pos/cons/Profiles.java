package com.jpp.pos.cons;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by JackPham
 **/
@Getter
@AllArgsConstructor
public enum Profiles {

    DEV("dev"),
    PROD("prod");

    private String profileName;
}
