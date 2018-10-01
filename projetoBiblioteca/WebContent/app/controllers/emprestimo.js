APP.controller('EmprestimoController', function($scope, $state, $stateParams, EmprestimoService) {
  $scope.emprestimos = EmprestimoService.query();
  $scope.successMessage = $stateParams.successMessage;
});

APP.controller('EmprestimoNovoController', function($scope, $state, $stateParams, EmprestimoService, LivroService, MutuarioService) {
  $scope.emprestimo = new EmprestimoService();
  $scope.livros = LivroService.query();
  $scope.mutuarios = MutuarioService.query();

  $scope.criarEmprestimo = function() {
    $scope.emprestimo.$save(
      function() {
        $state.go('emprestimos', {'successMessage': "Emprestimo criado com sucesso!"});
      },
      function() {
        $scope.errorMessage = "Ocorreu um erro no servidor. Verifique a disponobilidade do livro, ou se o mutuario referente não possui um emprestimo em aberto.";
      }
    );
  };
});

APP.controller('EmprestimoEditarController', function($scope, $state, $stateParams, EmprestimoService, LivroService, MutuarioService) {
  $scope.emprestimo = EmprestimoService.get({ id: $stateParams.id });
  $scope.livros = LivroService.query();
  $scope.mutuarios = MutuarioService.query();

  $scope.atualizarEmprestimo = function() {
    $scope.emprestimo.$update(
      function() {
        $state.go('emprestimos', {'successMessage': "Data de represtimo atualizada com sucesso!"});
      }, function() {
        $scope.errorMessage = "Ocorreu um erro no servidor. Verifique se todos os campos foram preenchidos corretamente.";
      }
    );
  };
});

APP.controller('EmprestimoDevolverController', function($scope, $state, $stateParams, EmprestimoService, LivroService, MutuarioService) {
	  $scope.emprestimo = EmprestimoService.get({ id: $stateParams.id });
	  $scope.livros = LivroService.query();
	  $scope.mutuarios = MutuarioService.query();

	  $scope.devolverEmprestimo = function() {
	    $scope.emprestimo.$update(
	      function() {
	        $state.go('emprestimos', {'successMessage': "Devolução realizada com sucesso!"});
	      }, function() {
	        $scope.errorMessage = "Ocorreu um erro no servidor. Verifique se todos os campos foram preenchidos corretamente.";
	      }
	    );
	  };
	});

APP.controller('EmprestimoRenovarController', function($scope, $state, $stateParams, EmprestimoService, LivroService, MutuarioService) {
	  $scope.emprestimo = EmprestimoService.get({ id: $stateParams.id });
	  $scope.livros = LivroService.query();
	  $scope.mutuarios = MutuarioService.query();

	  $scope.atualizarEmprestimo = function() {
	    $scope.emprestimo.$update(
	      function() {
	        $state.go('emprestimos', {'successMessage': "Data de emprestimo renovada com sucesso!"});
	      }, function() {
	        $scope.errorMessage = "Ocorreu um erro no servidor. Verifique se todos os campos foram preenchidos corretamente.";
	      }
	    );
	  };
	});
