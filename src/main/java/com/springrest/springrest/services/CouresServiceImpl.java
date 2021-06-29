package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service
public class CouresServiceImpl implements CourseService {
	
	@Autowired
	public CourseDao courseDao;
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	
	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		return courseDao.getOne(String.valueOf(courseId));
	}
	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}
	@Override
	public Courses updateCourse(Courses course, long courseId) {
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		Courses entity = courseDao.getOne(String.valueOf(courseId));
		courseDao.delete(entity);
	}
	
	/*List<Courses> list;
	
	public CouresServiceImpl() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		list.add(new Courses("125","Spring Boot","For beginners"));
		list.add(new Courses("129","Core Java","Advanced level"));
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		Courses c = null;
		 for(Courses each:list) {
			 if (Long.parseLong(each.getId()) == courseId) {
				 c=each;
				 break;
			 }
		 }
		return c;
	}
	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	@Override
	public Courses updateCourse(Courses course, long courseId) {
		// TODO Auto-generated method stub
		for(Courses each: list) {
			if (Long.parseLong(each.getId())==courseId) {
				each.setDescription(course.getDescription());
				each.setTitle(course.getTitle());
				break;
			}
		}
		return course;
	}
	
	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
//		String result ="Id not found for deletion";
		for(Courses each: list) {
			if (Long.parseLong(each.getId())==courseId) {
//				result = each.toString();
				list.remove(each);
				break;
			}
		}
//		return result;
	}*/
}
