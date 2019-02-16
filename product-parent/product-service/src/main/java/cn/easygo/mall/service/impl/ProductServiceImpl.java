package cn.easygo.mall.service.impl;

import cn.easygo.mall.domain.Product;
import cn.easygo.mall.mapper.ProductMapper;
import cn.easygo.mall.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author glw
 * @since 2019-02-15
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
