package com.xiaozhuaiyang.test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class AutoGeneratate {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        GlobalConfig gc = new GlobalConfig();
        String projectPath = "D:\\mybatisPlus-AutoGenerator";
        gc.setOutputDir(projectPath+"/src/main/java");
        gc.setAuthor("zglai");
        //gc.setSwagger2(true);
        //重新生成文件时是否覆盖
        gc.setFileOverride(true);
        //配置日期
        gc.setDateType(DateType.ONLY_DATE);
        gc.setServiceImplName("%sService");
        mpg.setGlobalConfig(gc);

        //包名配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.xiaozhuaiyang.business");
        pc.setEntity("Entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("comtroller");
        mpg.setPackageInfo(pc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://122.152.204.166:3307/hode?serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("Lai123321");
        mpg.setDataSource(dsc);

        //数据库表配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setInclude("sys_user,sys_job");
        strategy.setInclude("sys_user","sys_menu");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);

        //执行代码生成操作
        mpg.execute();
    }
}
