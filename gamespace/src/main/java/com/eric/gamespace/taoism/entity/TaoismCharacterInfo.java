package com.eric.gamespace.taoism.entity;

public class TaoismCharacterInfo extends TaoismCharacterInfoKey {
    private String characterName;

    private Integer characterLevel;

    private Long characterHp;

    private Long characterMp;

    private Long characterStr;

    private Long characterAgi;

    private Long characterInt;

    private Long characterDef;

    private Integer characterAlchemyLevel;

    private Integer characterForgeLevel;

    private String characterTitle;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName == null ? null : characterName.trim();
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(Integer characterLevel) {
        this.characterLevel = characterLevel;
    }

    public Long getCharacterHp() {
        return characterHp;
    }

    public void setCharacterHp(Long characterHp) {
        this.characterHp = characterHp;
    }

    public Long getCharacterMp() {
        return characterMp;
    }

    public void setCharacterMp(Long characterMp) {
        this.characterMp = characterMp;
    }

    public Long getCharacterStr() {
        return characterStr;
    }

    public void setCharacterStr(Long characterStr) {
        this.characterStr = characterStr;
    }

    public Long getCharacterAgi() {
        return characterAgi;
    }

    public void setCharacterAgi(Long characterAgi) {
        this.characterAgi = characterAgi;
    }

    public Long getCharacterInt() {
        return characterInt;
    }

    public void setCharacterInt(Long characterInt) {
        this.characterInt = characterInt;
    }

    public Long getCharacterDef() {
        return characterDef;
    }

    public void setCharacterDef(Long characterDef) {
        this.characterDef = characterDef;
    }

    public Integer getCharacterAlchemyLevel() {
        return characterAlchemyLevel;
    }

    public void setCharacterAlchemyLevel(Integer characterAlchemyLevel) {
        this.characterAlchemyLevel = characterAlchemyLevel;
    }

    public Integer getCharacterForgeLevel() {
        return characterForgeLevel;
    }

    public void setCharacterForgeLevel(Integer characterForgeLevel) {
        this.characterForgeLevel = characterForgeLevel;
    }

    public String getCharacterTitle() {
        return characterTitle;
    }

    public void setCharacterTitle(String characterTitle) {
        this.characterTitle = characterTitle == null ? null : characterTitle.trim();
    }
}