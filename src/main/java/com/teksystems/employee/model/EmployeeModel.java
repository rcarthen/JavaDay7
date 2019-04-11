package com.teksystems.employee.model;

import lombok.Data;
import java.util.List;
import java.util.Optional;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.teksystems.employee.repository.EmployeeRepository;

@Data
@Entity
@Table(name = "employee")
public class EmployeeModel implements EmployeeRepository {

	private @Id @GeneratedValue Long id;
	private String name;
	private String role;

	EmployeeModel(String name, String role) {
		this.name = name;
		this.role = role;
	}

	public EmployeeModel() {
		super();
	}

	@Override
	public List<EmployeeModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmployeeModel> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public void flush() {
	}

	@Override
	public <S extends EmployeeModel> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<EmployeeModel> entities) {
	}

	@Override
	public void deleteAllInBatch() {

	}

	@Override
	public EmployeeModel getOne(Long id) {
		return null;
	}

	@Override
	public <S extends EmployeeModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmployeeModel> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public Page<EmployeeModel> findAll(Pageable pageable) {

		return null;
	}

	@Override
	public <S extends EmployeeModel> S save(S entity) {
		return null;
	}

	@Override
	public Optional<EmployeeModel> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long id) {
	}

	@Override
	public void delete(EmployeeModel entity) {

	}

	@Override
	public void deleteAll(Iterable<? extends EmployeeModel> entities) {
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public <S extends EmployeeModel> Optional<S> findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends EmployeeModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends EmployeeModel> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends EmployeeModel> boolean exists(Example<S> example) {
		return false;
	}

}
