package com.project.housekeeping.pojo;

public class Staff {
    int id;                     //人员id
    String name;                //姓名
    int sex;                    //性别
    int age;                    //年龄
    int nation;                 //民族(外键表)
    String phone;               //移动电话
    enum degree{研究生,本科,大专,高中,高中以下};//学历
    int marital;                //婚姻状况
    String number;              //身份证号
    String natives;             //籍贯
    String birth_data;          //出生日期
    enum health{有,无};         //健康证
    String height;              //身高(cm)
    String weight;              //体重
    String service_number;      //服务卡号
    String qq;                  //qq号码
    String wechat;              //微信号
    int politics;               //政治面貌（外键表）
    enum filing{是,否};         //政府建档
    enum worker{是,否};         //下岗工人
    String mobile;              //紧急联系人
    String mobile_phone;        //紧急联系电话
    String cookie;              //烹饪菜系
    String work_date;           //工作年限
    String language;            //方言
    String address;             //常用地址
    String health_negative;     //健康证反面
    int occupation;             //职业资质（外键表）
    int housekeeping;           //家政服务(外键表)
    int service_experience;     //服务经验（外键表）
    int professional;           //专业技能（外键表）
    int state;                  //状态（1.可预约 2.工作中 3.已禁用）
    String reputation;          //好评

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNation() {
        return nation;
    }

    public void setNation(int nation) {
        this.nation = nation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMarital() {
        return marital;
    }

    public void setMarital(int marital) {
        this.marital = marital;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public String getBirth_data() {
        return birth_data;
    }

    public void setBirth_data(String birth_data) {
        this.birth_data = birth_data;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getService_number() {
        return service_number;
    }

    public void setService_number(String service_number) {
        this.service_number = service_number;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public int getPolitics() {
        return politics;
    }

    public void setPolitics(int politics) {
        this.politics = politics;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getWork_date() {
        return work_date;
    }

    public void setWork_date(String work_date) {
        this.work_date = work_date;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealth_negative() {
        return health_negative;
    }

    public void setHealth_negative(String health_negative) {
        this.health_negative = health_negative;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    public int getHousekeeping() {
        return housekeeping;
    }

    public void setHousekeeping(int housekeeping) {
        this.housekeeping = housekeeping;
    }

    public int getService_experience() {
        return service_experience;
    }

    public void setService_experience(int service_experience) {
        this.service_experience = service_experience;
    }

    public int getProfessional() {
        return professional;
    }

    public void setProfessional(int professional) {
        this.professional = professional;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }
}
