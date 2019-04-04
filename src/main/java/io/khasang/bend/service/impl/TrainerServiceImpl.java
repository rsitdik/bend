package io.khasang.bend.service.impl;

import io.khasang.bend.dao.TrainerDao;
import io.khasang.bend.entity.Trainer;
import io.khasang.bend.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {
    private TrainerDao trainerDao;

    @Override
    public Trainer add(Trainer trainer) {
        return trainerDao.add(trainer);
    }

    @Override
    public Trainer update(Trainer trainer) {
        return trainerDao.update(trainer);
    }

    @Override
    public Trainer delete(long id) {
        return trainerDao.delete(trainerDao.getById(id));
    }

    @Override
    public Trainer getById(long id) {
        return trainerDao.getById(id);
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return trainerDao.getAll();
    }

    @Autowired
    public void setTrainerDao(TrainerDao trainerDao) {
        this.trainerDao = trainerDao;
    }
}
