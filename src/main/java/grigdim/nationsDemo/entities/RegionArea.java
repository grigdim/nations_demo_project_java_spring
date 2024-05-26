package grigdim.nationsDemo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "region_areas")
public class RegionArea {
    @Id
    @Column(name = "region_name", nullable = false)
    private String regionName;

    @Column(name = "region_area", nullable = false)
    private double regionArea;

    public RegionArea() {
    }

    public RegionArea(String regionName, double regionArea) {
        this.regionName = regionName;
        this.regionArea = regionArea;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(double regionArea) {
        this.regionArea = regionArea;
    }
}
