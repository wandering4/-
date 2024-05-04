package service.impl;

import dao.AreaDao;
import dao.impl.AreaDaoImpl;
import pojo.Area;
import service.AreaService;

import java.util.List;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
public class AreaServiceImpl implements AreaService {
    private AreaDao areaDao =new AreaDaoImpl();
    @Override
    public List<Area> findByParentID(Integer parentID) {
        List<Area> areas = areaDao.findByParentID(parentID);
        return areas;
    }
}
