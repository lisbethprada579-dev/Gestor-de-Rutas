function eliminar(id) {
	swal({
		title: "Esta Seguro desea Eliminar el Registro?",
		text: "Una Vez Eliminado, No Podrá Recuperarlo!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/admin/eliminarPuntoRecarga/"+id, 
					success: function (res) {
						console.log(res);
					}
				});
				swal("Registro Eliminado con Éxito!", {
					icon: "success",
				}).then((ok)=>{
					if (ok){
						location.href="/admin/listarPuntoRecarga";
					}
				});
			} else {
				swal("Proceso de Eliminación Cancelado!");
			}
		});
}