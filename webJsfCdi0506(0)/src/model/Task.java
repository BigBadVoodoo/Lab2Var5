package model;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by BigBadVoodooDaddy on 05.06.2017.
 */
public class Task implements Element{

    private Integer id;
    private String key;
    private String title;
    private String content;
    private int numberOfDepartment;
    private LocalDate dateOfIssue;
    private Period plannedTimeOfPerformance;
    private Period actualTimeOfPerformance;
    private int producedPartsQuantity;
    private int boughtPartsQuantity;
    private double priceOfProduced;
    private double priceOfBought;
    private String approved;
    private String archiveRegistered;
    private double totalPrice;
    private double laborHours;
    private User user;

    public Task() {
    }

    public Task(Integer id, String key, String title, String content, int numberOfDepartment, LocalDate dateOfIssue, Period plannedTimeOfPerformance, Period actualTimeOfPerformance, int producedPartsQuantity, int boughtPartsQuantity, double priceOfProduced, double priceOfBought, String approved, String archiveRegistered, double totalPrice, double laborHours, User user) {
        this.id = id;
        this.key = key;
        this.title = title;
        this.content = content;
        this.numberOfDepartment = numberOfDepartment;
        this.dateOfIssue = dateOfIssue;
        this.plannedTimeOfPerformance = plannedTimeOfPerformance;
        this.actualTimeOfPerformance = actualTimeOfPerformance;
        this.producedPartsQuantity = producedPartsQuantity;
        this.boughtPartsQuantity = boughtPartsQuantity;
        this.priceOfProduced = priceOfProduced;
        this.priceOfBought = priceOfBought;
        this.approved = approved;
        this.archiveRegistered = archiveRegistered;
        this.totalPrice = totalPrice;
        this.laborHours = laborHours;
        this.user = user;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }

    public void setNumberOfDepartment(int numberOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Period getPlannedTimeOfPerformance() {
        return plannedTimeOfPerformance;
    }

    public void setPlannedTimeOfPerformance(Period plannedTimeOfPerformance) {
        this.plannedTimeOfPerformance = plannedTimeOfPerformance;
    }

    public Period getActualTimeOfPerformance() {
        return actualTimeOfPerformance;
    }

    public void setActualTimeOfPerformance(Period actualTimeOfPerformance) {
        this.actualTimeOfPerformance = actualTimeOfPerformance;
    }

    public int getProducedPartsQuantity() {
        return producedPartsQuantity;
    }

    public void setProducedPartsQuantity(int producedPartsQuantity) {
        this.producedPartsQuantity = producedPartsQuantity;
    }

    public int getBoughtPartsQuantity() {
        return boughtPartsQuantity;
    }

    public void setBoughtPartsQuantity(int boughtPartsQuantity) {
        this.boughtPartsQuantity = boughtPartsQuantity;
    }

    public double getPriceOfProduced() {
        return priceOfProduced;
    }

    public void setPriceOfProduced(double priceOfProduced) {
        this.priceOfProduced = priceOfProduced;
    }

    public double getPriceOfBought() {
        return priceOfBought;
    }

    public void setPriceOfBought(double priceOfBought) {
        this.priceOfBought = priceOfBought;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getArchiveRegistered() {
        return archiveRegistered;
    }

    public void setArchiveRegistered(String archiveRegistered) {
        this.archiveRegistered = archiveRegistered;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getLaborHours() {
        return laborHours;
    }

    public void setLaborHours(double laborHours) {
        this.laborHours = laborHours;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Object getId() {
        return null;
    }

    public static Task parseTask(String s) {
        return null;
    }
}
