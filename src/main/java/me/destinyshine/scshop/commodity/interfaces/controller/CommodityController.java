package me.destinyshine.scshop.commodity.interfaces.controller;

import java.util.List;

import javax.annotation.Resource;

import com.google.common.collect.ImmutableMap;
import me.destinyshine.scshop.commodity.application.CommodityService;
import me.destinyshine.scshop.commodity.domain.Commodity;
import me.destinyshine.scshop.commodity.properties.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author destinyliu
 */
@RestController
@RequestMapping("commodities")
public class CommodityController {

    @Resource
    private CommodityService commodityService;

    @Autowired
    private TestProperties testProperties;

    @RequestMapping("recommended")
    public List<Commodity> getRecommendedCommodities() {
        return commodityService.getRecommendedCommodities();
    }

    @RequestMapping("")
    public List<Commodity> getCommodities() {
        return commodityService.getRecommendedCommodities();
    }

    @RequestMapping("test")
    public Object test() {
        return ImmutableMap.of("myName", testProperties.getMyName());
    }

}
