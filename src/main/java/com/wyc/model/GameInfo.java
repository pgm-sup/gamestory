package com.wyc.model;

public class GameInfo {
    private Integer id;

    private String gamename;

    private String introduction;

    private String productcompany;

    private String publishcompany;

    private String language;

    private String gameimg;

    private String system;

    private String gamecategory;

    private String cpu;

    private String ram;

    private String rom;

    private String gpu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename == null ? null : gamename.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getProductcompany() {
        return productcompany;
    }

    public void setProductcompany(String productcompany) {
        this.productcompany = productcompany == null ? null : productcompany.trim();
    }

    public String getPublishcompany() {
        return publishcompany;
    }

    public void setPublishcompany(String publishcompany) {
        this.publishcompany = publishcompany == null ? null : publishcompany.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getGameimg() {
        return gameimg;
    }

    public void setGameimg(String gameimg) {
        this.gameimg = gameimg == null ? null : gameimg.trim();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getGamecategory() {
        return gamecategory;
    }

    public void setGamecategory(String gamecategory) {
        this.gamecategory = gamecategory == null ? null : gamecategory.trim();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu == null ? null : cpu.trim();
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram == null ? null : ram.trim();
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom == null ? null : rom.trim();
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu == null ? null : gpu.trim();
    }
}