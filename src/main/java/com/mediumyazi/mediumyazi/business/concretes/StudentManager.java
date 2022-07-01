package com.mediumyazi.mediumyazi.business.concretes;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mediumyazi.mediumyazi.business.abstracts.StudentService;
import com.mediumyazi.mediumyazi.dataAccess.abstracts.StudentDao;
import com.mediumyazi.mediumyazi.entities.concretes.Student;

@Service
public class StudentManager implements StudentService{

	private final StudentDao studentDao;

	public StudentManager(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public Student add(Student student) {
		return this.studentDao.save(student);
	}

	@Override
	@Cacheable(cacheNames = "student")
	public List<Student> getAll() throws InterruptedException {
		Thread.sleep(5000);
		return this.studentDao.findAll();
	}

	@Override
	@CacheEvict(cacheNames = "student")
	public void delete(int studentId) {
		this.studentDao.deleteById(studentId);
				
	}
	
}







