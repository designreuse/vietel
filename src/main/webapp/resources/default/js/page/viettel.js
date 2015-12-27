$(function() {
	displayTable();
	
	$("#newItemForm").validate({
		rules : {
			soHopDong :{
				required : true
			},
			soTbDaiDien : {
				required : true
			},
			tenKhachHang : {
				required : true
			},
			diaChi : {
				required : true
			},
			soHdGan : {
				required : true
			},
			tienNoDauKy : {
				required : true
			},
			maNVGanHoaDon : {
				required : true
			},
			maNVGiaoLai : {
				required : true
			},
			tenNVGiaoLai : {
				required : true
			},
			HTQLKhachHang : {
				required : true
			},
			dichVu : {
				required : true
			},
			hinhThucThanhToan : {
				required : true
			},
			mst : {
				required : true
			},
			nvtc : {
				required : true
			},
			huyen : {
				required : true
			},
			nvkd : {
				required : true
			}
		},
		messages : {
			soHopDong :{
				required : "Số HĐ không được trống"
			},
			soTbDaiDien : {
				required : "Thuê bao đại diện không được trống"
			},
			tenKhachHang : {
				required : "Tên khách hàng không được trống"
			},
			diaChi : {
				required : "Địa chỉ  không được trống"
			},
			soHdGan : {
				required : "Số HĐ Gán không được trống"
			},
			tienNoDauKy : {
				required : "Tiền nợ đầu kỳ không được trống"
			},
			maNVGanHoaDon : {
				required : "Mã NV Gán Hóa Đơn không được trống"
			},
			maNVGiaoLai : {
				required : "Mã NV Giao Lại không được trống"
			},
			tenNVGiaoLai : {
				required : "Tên NV Giao Lại không được trống"
			},
			HTQLKhachHang : {
				required : "HTQL Khách hàng không được trống"
			},
			dichVu : {
				required : "Dịch vụ không được trống"
			},
			hinhThucThanhToan : {
				required : "Hình thức thanh toán không được trống"
			},
			mst : {
				required : "Mã số thuế không được trống"
			},
			nvtc : {
				required : "Nvtc không được trống"
			},
			huyen : {
				required : "Huyện không được trống"
			},
			nvkd : {
				required : "NVKD không được trống"
			}
		},
	});
	
	$("#updateItemForm").validate({
		rules : {
			soHopDong :{
				required : true
			},
			soTbDaiDien : {
				required : true
			},
			tenKhachHang : {
				required : true
			},
			diaChi : {
				required : true
			},
			soHdGan : {
				required : true
			},
			tienNoDauKy : {
				required : true
			},
			maNVGanHoaDon : {
				required : true
			},
			maNVGiaoLai : {
				required : true
			},
			tenNVGiaoLai : {
				required : true
			},
			HTQLKhachHang : {
				required : true
			},
			dichVu : {
				required : true
			},
			hinhThucThanhToan : {
				required : true
			},
			mst : {
				required : true
			},
			nvtc : {
				required : true
			},
			huyen : {
				required : true
			},
			nvkd : {
				required : true
			}
		},
		messages : {
			soHopDong :{
				required : "Số HĐ không được trống"
			},
			soTbDaiDien : {
				required : "Thuê bao đại diện không được trống"
			},
			tenKhachHang : {
				required : "Tên khách hàng không được trống"
			},
			diaChi : {
				required : "Địa chỉ  không được trống"
			},
			soHdGan : {
				required : "Số HĐ Gán không được trống"
			},
			tienNoDauKy : {
				required : "Tiền nợ đầu kỳ không được trống"
			},
			maNVGanHoaDon : {
				required : "Mã NV Gán Hóa Đơn không được trống"
			},
			maNVGiaoLai : {
				required : "Mã NV Giao Lại không được trống"
			},
			tenNVGiaoLai : {
				required : "Tên NV Giao Lại không được trống"
			},
			HTQLKhachHang : {
				required : "HTQL Khách hàng không được trống"
			},
			dichVu : {
				required : "Dịch vụ không được trống"
			},
			hinhThucThanhToan : {
				required : "Hình thức thanh toán không được trống"
			},
			mst : {
				required : "Mã số thuế không được trống"
			},
			nvtc : {
				required : "Nvtc không được trống"
			},
			huyen : {
				required : "Huyện không được trống"
			},
			nvkd : {
				required : "NVKD không được trống"
			}
		},
	});
});

function displayTable() {
	var dataDepartments = [];
	$.ajax({
		url : "/vietel/enterpriseDatabase/getAll",
		type : "GET",
		dataType : "JSON",
		success : function(response) {
			var i = 0;
			$.each(response, function(key, value) {
				i++;
				dataDepartments.push([
						i,
						value.soHopDong,value.soTbDaiDien,value.tenKhachHang,value.diaChi,value.soHdGan,value.tienNoDauKy,
						"<button class='btn btn-sm btn-primary' onclick='editItem("
								+ value.id + ")' >Edit</button>",
						"<button class='btn btn-sm btn-danger' onclick='deleteItem("
								+ value.id + ")'>Delete</button>" ]);
			});
			$('#tblDepartment').dataTable({
				"bDestroy" : true,
				"bSort" : true,
				"bFilter" : true,
				"bLengthChange" : true,
				"bPaginate" : true,
				"sDom" : '<"top">rt<"bottom"flp><"clear">',
				"aaData" : dataDepartments,
				"aaSorting" : [],
				"aoColumns" : [ {
					"sTitle" : "No"
				}, {
					"sTitle" : "Số Hợp Đồng"
				}, {
					"sTitle" : "Số TB Đại Diện"
				}, {
					"sTitle" : "Tên Khách Hàng"
				}, {
					"sTitle" : "Địa chỉ"
				}, {
					"sTitle" : "Số HĐ Gán"
				}, {
					"sTitle" : "Tiền nợ đầu kỳ"
				}, {
					"sTitle" : "Edit"
				}, {
					"sTitle" : "Delete"
				} ]
			});
		}
	});
}

function editItem(id) {
	$.ajax({
		url : "/vietel/enterpriseDatabase/get",
		type : "GET",
		data : {
			itemId : id
		},
		dataType : "JSON",
		success : function(response) {
			$("#updateItemForm .enterpriseDatabaseId").val(response.id);
			$("#updateItemForm .soHopDong").val(response.soHopDong);
			$("#updateItemForm .soTbDaiDien").val(response.soTbDaiDien);
			$("#updateItemForm .tenKhachHang").val(response.tenKhachHang);
			$("#updateItemForm .diaChi").val(response.diaChi);
			$("#updateItemForm .soHdGan").val(response.soHdGan);
			$("#updateItemForm .tienNoDauKy").val(response.tienNoDauKy);
			$("#updateItemForm .maNVGanHoaDon").val(response.maNVGanHoaDon);
			$("#updateItemForm .maNVGiaoLai").val(response.maNVGiaoLai);
			$("#updateItemForm .tenNVGiaoLai").val(response.tenNVGiaoLai);
			$("#updateItemForm .HTQLKhachHang").val(response.HTQLKhachHang);
			$("#updateItemForm .dichVu").val(response.dichVu);
			$("#updateItemForm .hinhThucThanhToan").val(response.hinhThucThanhToan);
			$("#updateItemForm .mst").val(response.mst);
			$("#updateItemForm .nvtc").val(response.nvtc);
			$("#updateItemForm .huyen").val(response.huyen);
			$("#updateItemForm .nvkd").val(response.nvkd);
			$("#updateItem").modal("show");
		}
	});
}

function deleteItem(id) {
	if (confirm("Are you sure you want to proceed?") == true) {
		$.ajax({
			url : "/vietel/enterpriseDatabase/delete",
			type : "POST",
			data : {
				itemId : id
			},
			dataType : "JSON",
			success : function(response) {
				displayTable();
			}
		});
	}
}

function editedItem() {
	if($("#updateItemForm").valid()){
		var formData = new FormData($("#updateItemForm")[0]);
		$.ajax({
			url : "/vietel/enterpriseDatabase/update",
			type : "POST",
			data : formData,
			contentType:false,
			processData:false,
			dataType : "JSON",
			success : function(response) {
			},complete:function(){
				displayTable();
				document.getElementById("updateItemForm").reset();
				$("#updateItem").modal("hide");
			}
		});
	}
}

function insertItem() {
	if($("#newItemForm").valid()){
		var formData = new FormData($("#newItemForm")[0]);
		$.ajax({
			url : "/vietel/enterpriseDatabase/new",
			type : "POST",
			data : formData,
			contentType:false,
			processData:false,
			dataType : "JSON",
			success : function(response) {
			},
			complete : function(){
				displayTable();
				document.getElementById("newItemForm").reset();
				$("#newItemForm").modal("hide");
			}
		});
	}
}
