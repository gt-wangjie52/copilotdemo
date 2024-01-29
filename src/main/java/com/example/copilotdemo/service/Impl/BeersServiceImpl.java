package com.example.copilotdemo.service.Impl;

import com.example.copilotdemo.mapper.BeersMapper;
import com.example.copilotdemo.model.Beers;
import com.example.copilotdemo.service.BeersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 *
 * @author firefly by 2024/1/29
 */
@Service
public class BeersServiceImpl implements BeersService {

    @Autowired
    private BeersMapper beersMapper;

    @Override
    public List<Beers> selectBeersList(Beers beers) {
        return beersMapper.selectBeersList(beers);
    }

    @Override
    public Beers selectBeersById(Integer id) {
        return beersMapper.selectBeersById(id);
    }

    @Override
    public int insertBeers(Beers beers) {
        return beersMapper.insertBeers(beers);
    }

    @Override
    public int updateBeers(Beers beers) {
        return beersMapper.updateBeers(beers);
    }

    @Override
    public int deleteBeers(Integer id) {
        return beersMapper.deleteBeers(id);
    }

}
