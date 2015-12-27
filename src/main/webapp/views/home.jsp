<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="row">
			<div class="col-lg-12">
				<div class="ibox">
					<div class="ibox-content">
						<a href="<c:url value='/admin/enterpriseDatabase/list'/>" class="btn-link">
							<h2>Quản trị hồ sơ viettel</h2>
						</a>
						<button data-toggle="modal" data-target="#newItem"class="btn btn-sm btn-primary">Tạo mới</button>
						<div class="table-responsive">
							<table id="tblDepartment"
								class="table table-bordered table-hover table-striped">
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="newItem" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Thêm Hđ</h4>
					</div>
					<form id="newItemForm" class="form-horizontal" method="POST">
					<div class="modal-body">
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Số Hợp Đồng</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="soHopDong" name="soHopDong" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Số TB Đại Diện</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="soTbDaiDien" name="soTbDaiDien" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Tên Khách Hàng</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="tenKhachHang" name="tenKhachHang" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Địa Chỉ</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="diaChi" name="diaChi" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Số Hợp Đồng Gán</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="soHdGan" name="soHdGan" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Tiền nợ đầu kỳ</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="tienNoDauKy" name="tienNoDauKy" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Mã NV Hóa Đơn</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="maNVGanHoaDon" name="maNVGanHoaDon" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Mã NV Giao Lại</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="maNVGiaoLai" name="maNVGiaoLai" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Tên NV Giao Lại</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="tenNVGiaoLai" name="tenNVGiaoLai" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">HTQL Khách hàng</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="HTQLKhachHang" name="HTQLKhachHang" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Dịch vụ</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="dichVu" name="dichVu" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Hình thức thanh toán</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="hinhThucThanhToan" name="hinhThucThanhToan" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Mã số thuế</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="mst" name="mst" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">NVTC</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="nvtc" name="nvtc" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Huyện</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="huyen" name="huyen" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">NVKD</label>
							<div class="col-sm-10">
							<input type="text" class="form-control" id="nvkd" name="nvkd" >
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" onclick="insertItem();" class="btn btn-primary">Save</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
					</form>
				</div>
			</div>
		</div>
		<div class="modal fade" id="updateItem" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Edit Role</h4>
					</div>
					<form id="updateItemForm" class="form-horizontal" method="POST">
					<div class="modal-body">
						<input type="text" class="enterpriseDatabaseId form-control hide" id="enterpriseDatabaseId" name="enterpriseDatabaseId" >
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Số Hợp Đồng</label>
							<div class="col-sm-10">
							<input type="text" class="soHopDong form-control" name="soHopDong" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Số TB Đại Diện</label>
							<div class="col-sm-10">
							<input type="text" class="soTbDaiDien form-control" name="soTbDaiDien" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Tên Khách Hàng</label>
							<div class="col-sm-10">
							<input type="text" class="tenKhachHang form-control" name="tenKhachHang" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Địa Chỉ</label>
							<div class="col-sm-10">
							<input type="text" class="diaChi form-control" name="diaChi" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Số Hợp Đồng Gán</label>
							<div class="col-sm-10">
							<input type="text" class="soHdGan form-control" name="soHdGan" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Tiền nợ đầu kỳ</label>
							<div class="col-sm-10">
							<input type="text" class="tienNoDauKy form-control" name="tienNoDauKy" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Mã NV Hóa Đơn</label>
							<div class="col-sm-10">
							<input type="text" class="maNVGanHoaDon form-control" name="maNVGanHoaDon" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Mã NV Giao Lại</label>
							<div class="col-sm-10">
							<input type="text" class="maNVGiaoLai form-control" name="maNVGiaoLai" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Tên NV Giao Lại</label>
							<div class="col-sm-10">
							<input type="text" class="tenNVGiaoLai form-control" name="tenNVGiaoLai" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">HTQL Khách hàng</label>
							<div class="col-sm-10">
							<input type="text" class="HTQLKhachHang form-control" name="HTQLKhachHang" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Dịch vụ</label>
							<div class="col-sm-10">
							<input type="text" class="dichVu form-control" name="dichVu" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Hình thức thanh toán</label>
							<div class="col-sm-10">
							<input type="text" class="hinhThucThanhToan form-control" name="hinhThucThanhToan" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Mã số thuế</label>
							<div class="col-sm-10">
							<input type="text" class="mst form-control" name="mst" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">NVTC</label>
							<div class="col-sm-10">
							<input type="text" class="nvtc form-control" name="nvtc" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Huyện</label>
							<div class="col-sm-10">
							<input type="text" class="huyen form-control" name="huyen" >
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">NVKD</label>
							<div class="col-sm-10">
							<input type="text" class="nvkd form-control" name="nvkd" >
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" onclick="editedItem();" class="btn btn-primary">Edit</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
					</form>
				</div>
			</div>
		</div>
		<script
			src="<c:url value='/resources/default/js/page/viettel.js'/>"></script>
	</tiles:putAttribute>
</tiles:insertDefinition>