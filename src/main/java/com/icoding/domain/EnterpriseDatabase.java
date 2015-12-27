package com.icoding.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enterprise_database")
public class EnterpriseDatabase {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="so_hop_dong",length=255)
	private String soHopDong;
	
	@Column(name="so_tb_dai_dien",length=255)
	private String soTbDaiDien;
	
	@Column(name="ten_khach_hang",length=255)
	private String tenKhachHang;
	
	@Column(name="dia_chi",length =255)
	private String diaChi;
	
	@Column(name="so_hd_gan",length = 255)
	private String soHdGan;
	
	@Column(name="tien_no_dau_ky", length = 255)
	private String tienNoDauKy;
	
	@Column(name ="ma_nv_gan_hoa_don",length = 255)
	private String maNVGanHoaDon;
	
	@Column(name="ma_nv_giao_lai",length=255)
	private String maNVGiaoLai;
	
	@Column(name="ten_nv_giao_lai",length = 255)
	private String tenNVGiaoLai;
	
	@Column(name="htql_khach_hang",length = 255)
	private String HTQLKhachHang;
	
	@Column(name="dich_vu",length = 255)
	private String dichVu;
	
	@Column(name="hinh_thuc_thanh_toan",length = 255)
	private String hinhThucThanhToan;
	
	@Column(name ="mst",length=255)
	private String mst;
	
	@Column(name = "nvtc",length=255)
	private String nvtc;
	
	@Column(name="huyen",length=255)
	private String huyen;
	
	@Column(name="nvkd",length=255)
	private String nvkd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSoHopDong() {
		return soHopDong;
	}

	public void setSoHopDong(String soHopDong) {
		this.soHopDong = soHopDong;
	}

	public String getSoTbDaiDien() {
		return soTbDaiDien;
	}

	public void setSoTbDaiDien(String soTbDaiDien) {
		this.soTbDaiDien = soTbDaiDien;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoHdGan() {
		return soHdGan;
	}

	public void setSoHdGan(String soHdGan) {
		this.soHdGan = soHdGan;
	}

	public String getTienNoDauKy() {
		return tienNoDauKy;
	}

	public void setTienNoDauKy(String tienNoDauKy) {
		this.tienNoDauKy = tienNoDauKy;
	}

	public String getMaNVGanHoaDon() {
		return maNVGanHoaDon;
	}

	public void setMaNVGanHoaDon(String maNVGanHoaDon) {
		this.maNVGanHoaDon = maNVGanHoaDon;
	}

	public String getMaNVGiaoLai() {
		return maNVGiaoLai;
	}

	public void setMaNVGiaoLai(String maNVGiaoLai) {
		this.maNVGiaoLai = maNVGiaoLai;
	}

	public String getTenNVGiaoLai() {
		return tenNVGiaoLai;
	}

	public void setTenNVGiaoLai(String tenNVGiaoLai) {
		this.tenNVGiaoLai = tenNVGiaoLai;
	}

	public String getHTQLKhachHang() {
		return HTQLKhachHang;
	}

	public void setHTQLKhachHang(String hTQLKhachHang) {
		HTQLKhachHang = hTQLKhachHang;
	}

	public String getDichVu() {
		return dichVu;
	}

	public void setDichVu(String dichVu) {
		this.dichVu = dichVu;
	}

	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}

	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}

	public String getMst() {
		return mst;
	}

	public void setMst(String mst) {
		this.mst = mst;
	}

	public String getNvtc() {
		return nvtc;
	}

	public void setNvtc(String nvtc) {
		this.nvtc = nvtc;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getNvkd() {
		return nvkd;
	}

	public void setNvkd(String nvkd) {
		this.nvkd = nvkd;
	}
	
}
