package com.brighttalk.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    static class EmployeeRowMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setId(rs.getLong("id"));
            employee.setFirstName(rs.getString("first_name"));
            employee.setLastName(rs.getString("last_name"));
            employee.setEmail(rs.getString("email"));
            employee.setPhone(rs.getString("phone"));
            return employee;
        }
    }

    public List<Employee> findAll() {
        return jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
    }

    public Optional<Employee> findById(long id) {
        return Optional.ofNullable(
                jdbcTemplate.queryForObject(
                        "select * from employee where id=?", new Object[]{id},
                        new BeanPropertyRowMapper<Employee>(Employee.class)
                )
        );
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from employee where id=?", id);
    }

    public int insert(Employee employee) {
        return jdbcTemplate.update("insert into employee (id, first_name, last_name, email, phone) " + "values(?, ?, ?, ?, ?)",
                employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getPhone());

    }

    public int update(Employee employee) {
        return jdbcTemplate.update("update employee " + " set first_name = ?, last_name = ?, email = ?, phone = ? " + " where id = ?",
                employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getPhone(), employee.getId());
    }

}
