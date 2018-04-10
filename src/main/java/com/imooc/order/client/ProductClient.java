package com.imooc.order.client;
import com.imooc.order.dataobject.ProductInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-10 21:04
 */
//@FeignClient(name = "product")
public interface ProductClient {

//    @GetMapping("/msg")
//    String productMsg();
//
//    @PostMapping("/product/listForOrder")
//    List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);

}

