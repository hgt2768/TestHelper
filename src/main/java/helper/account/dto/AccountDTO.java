package helper.account.dto;

public class AccountDTO {
    private String id;             // id
    private String pwd;            // 비밀번호
    private String name;           //  이름
    private String accountType;    //  계정 타입
    private String addr;           //  주소
    private String tel;            //  전화번호
    private String gender;         //  성별
    private String createTime;     //  계정 생성일
    private String photo;          //  계정 사진

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", accountType='" + accountType + '\'' +
                ", addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                ", gender='" + gender + '\'' +
                ", createTime='" + createTime + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
