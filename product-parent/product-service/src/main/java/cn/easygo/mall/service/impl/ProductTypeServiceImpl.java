package cn.easygo.mall.service.impl;

import cn.easygo.mall.domain.ProductType;
import cn.easygo.mall.mapper.ProductTypeMapper;
import cn.easygo.mall.service.IProductTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author glw
 * @since 2019-02-15
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

}
