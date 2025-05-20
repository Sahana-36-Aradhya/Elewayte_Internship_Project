package com.ely.internship.MinorProject;

import java.util.Objects;

public class StudentInfo {
	private String name;
	private int stdId;
	private double cgpa;
	private String majorSub;
	
	public StudentInfo(String name, int stdId, double cgpa, String majorSub) {
		this.name = name;
		this.stdId = stdId;
		this.cgpa = cgpa;
		this.majorSub = majorSub;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getMajorSub() {
		return majorSub;
	}
	public void setMajorSub(String majorSub) {
		this.majorSub = majorSub;
	}

	@Override
	public String toString() {
		return "Name = " + name + ", Student ID = " + stdId + ", CGPA = " + cgpa + ", Major Subject = " + majorSub;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cgpa, majorSub, name, stdId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentInfo other = (StudentInfo) obj;
		return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa)
				&& Objects.equals(majorSub, other.majorSub) && Objects.equals(name, other.name) && stdId == other.stdId;
	}
	
}
