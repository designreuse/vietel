package com.icoding.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icoding.domain.EnterpriseDatabase;
import com.icoding.service.EnterpriseDatabaseService;

@Controller
public class EnterpriseDatabaseController extends GenericController {

	@Autowired
	private EnterpriseDatabaseService enterpriseDatabaseService;

	@RequestMapping(value = { "/admin/enterpriseDatabase", "/admin/enterpriseDatabase/list" }, method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
	@Secured({ "ROLE_ADMIN", "ROLE_PVC" })
	public String displayPage(Model model) {
		model.addAttribute("pageName", "Manage EnterpriseDatabase");
		model.addAttribute("title", "Manage EnterpriseDatabase");
		return "enterpriseDatabase/index";
	}

	@RequestMapping(value = "/enterpriseDatabase/getAll", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<EnterpriseDatabase> getAll(Model model) {
		List<EnterpriseDatabase> listEnterpriseDatabases = new ArrayList<EnterpriseDatabase>();
		listEnterpriseDatabases = enterpriseDatabaseService.getAll();
		return listEnterpriseDatabases;
	}

	@RequestMapping(value = "/enterpriseDatabase/delete", method = RequestMethod.POST)
	@ResponseBody
	public String deleteEnterpriseDatabase(@RequestParam(value = "itemId") String itemId) {
		Integer id = Integer.parseInt(itemId);
		EnterpriseDatabase enterpriseDatabase = enterpriseDatabaseService.get(id);
		enterpriseDatabaseService.remove(enterpriseDatabase);
		return "false";
	}

	@RequestMapping(value = "/enterpriseDatabase/new", method = RequestMethod.POST)
	@ResponseBody
	public String addenterpriseDatabase(@RequestParam(value = "soHopDong") String soHopDong,
			@RequestParam(value = "soTbDaiDien") String soTbDaiDien,
			@RequestParam(value = "tenKhachHang") String tenKhachHang,
			@RequestParam(value = "diaChi") String diaChi,
			@RequestParam(value = "soHdGan") String soHdGan,
			@RequestParam(value = "tienNoDauKy") String tienNoDauKy,
			@RequestParam(value = "maNVGanHoaDon") String maNVGanHoaDon,
			@RequestParam(value = "maNVGiaoLai") String maNVGiaoLai,
			@RequestParam(value = "tenNVGiaoLai") String tenNVGiaoLai,
			@RequestParam(value = "HTQLKhachHang") String HTQLKhachHang,
			@RequestParam(value = "dichVu") String dichVu,
			@RequestParam(value = "hinhThucThanhToan") String hinhThucThanhToan,
			@RequestParam(value = "mst") String mst,
			@RequestParam(value = "nvtc") String nvtc,
			@RequestParam(value = "huyen") String huyen,
			@RequestParam(value = "nvkd") String nvkd) {
		EnterpriseDatabase enterpriseDatabase = new EnterpriseDatabase();
		enterpriseDatabase.setSoHopDong(soHopDong);
		enterpriseDatabase.setSoTbDaiDien(soTbDaiDien);
		enterpriseDatabase.setTenKhachHang(tenKhachHang);
		enterpriseDatabase.setDiaChi(diaChi);
		enterpriseDatabase.setSoHdGan(soHdGan);
		enterpriseDatabase.setTienNoDauKy(tienNoDauKy);
		enterpriseDatabase.setMaNVGanHoaDon(maNVGanHoaDon);
		enterpriseDatabase.setMaNVGiaoLai(maNVGiaoLai);
		enterpriseDatabase.setTenNVGiaoLai(tenNVGiaoLai);
		enterpriseDatabase.setHTQLKhachHang(HTQLKhachHang);
		enterpriseDatabase.setDichVu(dichVu);
		enterpriseDatabase.setHinhThucThanhToan(hinhThucThanhToan);
		enterpriseDatabase.setMst(mst);
		enterpriseDatabase.setNvtc(nvtc);
		enterpriseDatabase.setHuyen(huyen);
		enterpriseDatabase.setNvkd(nvkd);
		try {
			enterpriseDatabaseService.saveOrUpdate(enterpriseDatabase);
			return "true";
		} catch (Exception e) {
			return "false";
		}
	}

	@RequestMapping(value = "/enterpriseDatabase/update", method = RequestMethod.POST)
	@ResponseBody
	public String updateenterpriseDatabase(@RequestParam(value = "enterpriseDatabaseId") String enterpriseDatabaseId,
			@RequestParam(value = "soHopDong") String soHopDong,
			@RequestParam(value = "soTbDaiDien") String soTbDaiDien,
			@RequestParam(value = "tenKhachHang") String tenKhachHang,
			@RequestParam(value = "diaChi") String diaChi,
			@RequestParam(value = "soHdGan") String soHdGan,
			@RequestParam(value = "tienNoDauKy") String tienNoDauKy,
			@RequestParam(value = "maNVGanHoaDon") String maNVGanHoaDon,
			@RequestParam(value = "maNVGiaoLai") String maNVGiaoLai,
			@RequestParam(value = "tenNVGiaoLai") String tenNVGiaoLai,
			@RequestParam(value = "HTQLKhachHang") String HTQLKhachHang,
			@RequestParam(value = "dichVu") String dichVu,
			@RequestParam(value = "hinhThucThanhToan") String hinhThucThanhToan,
			@RequestParam(value = "mst") String mst,
			@RequestParam(value = "nvtc") String nvtc,
			@RequestParam(value = "huyen") String huyen,
			@RequestParam(value = "nvkd") String nvkd) {
		EnterpriseDatabase enterpriseDatabase = enterpriseDatabaseService.get(Integer.parseInt(enterpriseDatabaseId));
		enterpriseDatabase.setSoHopDong(soHopDong);
		enterpriseDatabase.setSoTbDaiDien(soTbDaiDien);
		enterpriseDatabase.setTenKhachHang(tenKhachHang);
		enterpriseDatabase.setDiaChi(diaChi);
		enterpriseDatabase.setTienNoDauKy(tienNoDauKy);
		enterpriseDatabase.setSoHdGan(soHdGan);
		enterpriseDatabase.setMaNVGanHoaDon(maNVGanHoaDon);
		enterpriseDatabase.setMaNVGiaoLai(maNVGiaoLai);
		enterpriseDatabase.setTenNVGiaoLai(tenNVGiaoLai);
		enterpriseDatabase.setHTQLKhachHang(HTQLKhachHang);
		enterpriseDatabase.setDichVu(dichVu);
		enterpriseDatabase.setHinhThucThanhToan(hinhThucThanhToan);
		enterpriseDatabase.setMst(mst);
		enterpriseDatabase.setNvtc(nvtc);
		enterpriseDatabase.setHuyen(huyen);
		enterpriseDatabase.setNvkd(nvkd);
		try {
			enterpriseDatabaseService.saveOrUpdate(enterpriseDatabase);
			return "true";
		} catch (Exception e) {
			return "false";
		}
	}

	@RequestMapping(value = "/enterpriseDatabase/get", method = RequestMethod.GET)
	@ResponseBody
	public EnterpriseDatabase getenterpriseDatabase(@RequestParam(value = "itemId") String itemId) {
		EnterpriseDatabase enterpriseDatabase = enterpriseDatabaseService.get(Integer.parseInt(itemId));
		return enterpriseDatabase;
	}

}
