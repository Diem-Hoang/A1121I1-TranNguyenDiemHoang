package model.bean.ContractDAO;

public class ContractDetail {
    private int idContractDetail;
    private int idContract;
    private int quantity;
    private int idAttachService;

    public ContractDetail() {
    }

    public ContractDetail(int idContractDetail, int idContract, int quantity, int idAttachService) {
        this.idContractDetail = idContractDetail;
        this.idContract = idContract;
        this.quantity = quantity;
        this.idAttachService = idAttachService;
    }

    public int getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(int idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIdAttachService() {
        return idAttachService;
    }

    public void setIdAttachService(int idAttachService) {
        this.idAttachService = idAttachService;
    }
}
