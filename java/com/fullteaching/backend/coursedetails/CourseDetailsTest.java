package com.fullteaching.backend.coursedetails;

import com.fullteaching.backend.course.Course;
import org.junit.Before;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

public class CourseDetailsTest {

    @Mock
    private Course mockCourse;

    private CourseDetails courseDetailsUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
        courseDetailsUnderTest = new CourseDetails(mockCourse);
    }
}
