package com.phorse.bricker.group.easyexcel.model;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * TODO
 *
 * @author luoxusheng 2021/10/20 14:59
 * @version v1.0.0
 */
public class ComplexHeadData {
    @ExcelProperty({"顶格", "顶格", "两格"})
    private String string0;
    @ExcelProperty({"顶格", "顶格", "两格"})
    private String string1;
    @ExcelProperty({"顶格", "四联", "四联"})
    private String string2;
    @ExcelProperty({"顶格", "四联", "四联"})
    private String string3;
    @ExcelProperty({"顶格"})
    private String string4;
}
