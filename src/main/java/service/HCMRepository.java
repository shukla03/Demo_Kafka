package service;

import entity.HCM;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class HCMRepository implements JpaRepository<HCM, Long> {
    @Override
    public List<HCM> findAll() {
        return null;
    }

    @Override
    public List<HCM> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<HCM> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public <S extends HCM> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<HCM> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Page<HCM> findAll(Pageable pageable) {
        return null;
    }


    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(HCM hcm) {

    }

    @Override
    public void deleteAll(Iterable<? extends HCM> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends HCM> S save(S s) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends HCM> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<HCM> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public HCM getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends HCM> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends HCM> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends HCM> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends HCM> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends HCM> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends HCM> boolean exists(Example<S> example) {
        return false;
    }
}
