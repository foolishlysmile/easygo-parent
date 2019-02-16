package cn.easygo.mall.service.impl;

import cn.easygo.mall.domain.Brand;
import cn.easygo.mall.mapper.BrandMapper;
import cn.easygo.mall.service.IBrandService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author glw
 * @since 2019-02-15
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
