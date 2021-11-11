package up.eager.javaexperience.unicornRestApi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "onlineOrder")
public class Unicorn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int unicornId;
	
	@Column
	private String name;
	@Column
	private String hairColor;
	@Column
    private int hornLength;
	@Column
	private String hornColor;
	@Column
	private String eyeColor;
	@Column
	private int height;
	@Column
	private String heightUnit;
	@Column
	private int weight;
	@Column
	private String weightUnit;
	@Column
	private String side;
	@Column
	private String location;
	@Column
	private String mark;
	@Column
	private String color;
	public int getUnicornId() {
		return unicornId;
	}
	public void setUnicornId(int unicornId) {
		this.unicornId = unicornId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public int getHornLength() {
		return hornLength;
	}
	public void setHornLength(int hornLength) {
		this.hornLength = hornLength;
	}
	public String getHornColor() {
		return hornColor;
	}
	public void setHornColor(String hornColor) {
		this.hornColor = hornColor;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getHeightUnit() {
		return heightUnit;
	}
	public void setHeightUnit(String heightUnit) {
		this.heightUnit = heightUnit;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getWeightUnit() {
		return weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


}
