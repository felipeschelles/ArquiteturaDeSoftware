APP.factory("EmprestimoService", function($resource) {
  return $resource('http://localhost:8080/projetoBiblioteca/api/emprestimos/:id', {id:'@_id'},{
    update: {
      method  : 'PUT',
      url     : 'http://localhost:8080/projetoBiblioteca/api/emprestimos/:id',
      params  : { id: '@id' },
      isArray : false
    }
  });
});
