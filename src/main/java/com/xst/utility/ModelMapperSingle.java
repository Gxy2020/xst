package com.xst.utility;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

/**
 * @author GUO
 * @Classname ModelMapperSingle
 * @Description TODO
 * @Date 2020/11/16 20:31
 */
public class ModelMapperSingle {
    protected final static ModelMapper modelMapper = new ModelMapper();
    private final static ModelMapperSingle modelMapperSingle = new ModelMapperSingle();

    static {
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public static ModelMapper Instance() {
        return modelMapperSingle.modelMapper;
    }
}
