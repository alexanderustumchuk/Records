Это комментарий к тому "Git".

Этот том не требует комментариев.
Разве что, можно заметить следующее:
в томе часто даются ссылки на прочие источники,
это дейтвительно необходимо, так как сведения (на которые даны ссылки) вряд ли будут интересны начинающим пользователям данной утилиты,
кроме того, редко используются продвинутыми пользователями;
о настройках - имя пользователя утилиты Git - это имя пользователя самой утилиты (оно может быть произвольным; оно может, но не обязано, совпадать с именем пользователясайта GitHub);
о настройках - адрес Email пользователя утилиты Git должен быть адресом, указанным на GitHub - чтобы этим сервисом можно было пользоваться из утилиты (таким путем, аккаунт на сайте и пользователь утилиты ассоциируются);
о легковесных тегах - они создаются простой записью - $ git tag VersionTag (флаги употребляться не должны);
об отложенном создании тегов - теги для целевого (не обязательно последнего) коммита создаются так - запись создания (легковесного или анноированного) тега завершается записью хэша целевого коммита;
об отправке тегов вместе с коммитами - по умолчанию, команда $ git push не отправляет присвоенные коммитам теги,
но их можно отправить - команда $ git push RepName --tags приведет к отправке всех имеющихся тегов (данная команда отправляет только теги),
а команда $ git push RepName VersionTag отправит указанный тег (она тоже отправляет только теги);
об удалении тегов - это производится записью $ git tag -d VersionTag,
при этом, если тег имеется на сервере, то он не удалится этой командой - для удаления тега на сервере служит команда $git push RepName --delete VersionTag (для удаления тегов из локального и удаленного репозиториев используются две разные команды);
о команде $ git push - эта команда употребляется в записи так - $ git push RepName BranchName;
о Vim - задать его по умолчанию можно записью - $ git config --global core.editor "vim";
об интеграции с сервисом GitHub -интеграция осуществляется настройкой утилиты Git;
о доступе через SSH - доступ через SSH производится записью git@github.com:UserName/RepName.git,доступ через HTTP итак былописан в томе;