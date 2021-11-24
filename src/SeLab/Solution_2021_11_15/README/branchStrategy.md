# Git Branch 전략

***

* 여러 개발자가 하나의 저장소를 사용하는 환경에서 저장소를 효과적으로 이용하기 위한` Work-Flow`

***

## TABLE

* ### [GitHub Flow](#📃-github-flow)
* ### [GitHub Flow 의 장단점](#github-flow-의-장단점)
* ### [Git Flow](#📃-git-flow)
* ### [Git Flow 의 장단점](git-flow-의-장단점)
* ### [GitLab-Flow](#📃-gitlab-flow)

***

## 📃 GitHub Flow

***

* 1개의 `master` 브랜치, 1개의` feature` 브랜치 로 이루어져있다. `PR(PUll-REQUEST)` 을 활용 한 branch 전략이다.
*

<br><br>

### 1. 브랜치는 어느 상황이든 배포가 가능하다.

<div style="text-align: center;">
<img style="" height="204" src="https://user-images.githubusercontent.com/54024213/143216398-03dc59f0-ad91-4dd6-97c9-6ad0fbee0303.png" width="602"/>
 </div>
<br>

* `master branch`는 항상 최신상태이며 stable 상대로 `product`에 배포된다.!
* 라이브 서버에 바로 업데이트 되는 브랜치 이기에` 엄격한 검증(review / test)`이 필요   
  -> **빌드가 실패하거나 배포 시 에러가 발생하지 않아야한다.**
* `merge` 를 진행하기전 브랜치 에 push 하여 테스트 진행 필요

<br><br>

### 2. master에서 새로운일을 시작하기위해 브랜치를 만들때 이름을 명확히 한다.

<div style="text-align: center;">
<img style="" height="204" src="https://user-images.githubusercontent.com/54024213/143216398-03dc59f0-ad91-4dd6-97c9-6ad0fbee0303.png" width="602"/>
 </div>
<br>

* 브랜치는 항상 main 으로부터 만든다.
* [Git-Flow](#git-flow)와 다르게 `develop`  branch 가 존재하지 않는다.
* 새로운 기능 추가 | 버그해결 위한 브랜치는 어떤일을 하는지 자세히 작성필요
* `Commit Comment` 를 확실하게 하자!
  <br><br>

### 3. [Remote Repository](#3-remote-repository)  브랜치로 수시로 [push](#push) 하자.

* 항상 `Remote Repository` 에 자신이 하고 있는 작업을 올려 다른 사람들도 확인 하도록함. (BACKUP)
  <br><br><br>

### 4. FeedBack | 도움 필요할때 || [merge](#merge) 준비 완료시 [PULL REQUEST](#pull-request) 생성

<div style="text-align: center;">
<img style="" height="204" src="https://user-images.githubusercontent.com/54024213/143216986-27fa91c5-ab1d-4a6a-9665-98761d900209.png" width="602"/>
 </div>

* `merge` 가 이루어 지면 live 서버에 배포되기 때문에 상세히 이루어져야함.
* 자신의 코드를 PR 요청하여 **항상** 리뷰 받고 수정 후 `master branch` 로 반영 요구
  <br><br>

### 5.TEST

<div style="text-align: center;">
<img style="" height="204" src="https://user-images.githubusercontent.com/54024213/143217057-7edc2799-5a07-4edb-adb6-c358e729087c.png" width="602"/>
 </div>
<br>

* 바로 product 로 반영 되기 때문에 충분한 논의 필요!
* review 를 통한 배포버전을 테스트한다 <small>(문제 발생시 `master` 내용을 초기화)</small>
  <br><br>

### 6.master로 merge되고 push 되었을 때는 즉시 배포 되어야한다!!

<div style="text-align: center;">
<img style="" height="204" src="https://user-images.githubusercontent.com/54024213/143217057-7edc2799-5a07-4edb-adb6-c358e729087c.png" width="602"/>
 </div>
<br>

* `mater`로 `merge`가 일어나면 자동으로 배포 되도록 설정 필요
  <br><br>

***

## GitHub Flow 의 장단점

### GOOD

* 흐름이 간단하여 누구나 손쉽게 이해하고 접근할 수 있다. (심지어는 git을 사용하지 않은 개발자도..)
* Github 에서 제공하는 [이슈](#isuue)를 활용할 수 있다.
* 배포가 빈번한 [MSA 환경](#MSA)등 민첩한 [CI/CD](#CI/CD) 배포 전략을 수립하기 용이하다.
* 소규모 팀과 웹 애플리케이션 프로젝트 진행하기 적합하다.
* 구글의 대부분의 프로젝트가 사용하는 기법!
  <br><br><br>

### BAD

* 동시에 여러 버전의 소스를 지원하지 않는다.
* Review 의 중요성이 매우 높기 때문에 INFRA 관점의 이해도가 높은 리더가 반드시 존재해야함.
* Develop 브랜치가 존재하지 않아 운영 버그에 취약하다.
  <br><br><br>

***

## 📃 [Git Flow](https://github.com/nvie/gitflow)

* 5개의 저장소 `master , develop, feature, release, hofix` 를 통해 브랜치를 관리하는 전략   
  <br>

### `master`

<div style="text-align: center;">
<img height="295" src="https://user-
images.githubusercontent.com/54024213/143217363-af7cc73b-a2d6-4b11-9976-955931649c66.png" width="550"/>
</div>
<br>

* 최종적으로 배포되는 가장 중심의 브랜치이다. `develop` 브랜치에서는 개발이 진행되어도 이전 release 브랜치에 내용이 master에 배포 되어있다.

<br>

### `develop`

<br> 

* 개발을 진행하는 브랜치로 중심적인 브랜치, 하나의 `feature` 브랜치 가 `merge` 될때 마다 해당기능이 더해지며 배포할 수준의 기능이 갖춰지면 `release` 브랜치로 `merge` 된다

<br>

### `feature`

<div style="text-align: center;">
<img height="295" src="https://user-images.githubusercontent.com/54024213/143217361-8d29d224-43b0-44b2-bc12-a9321cd96334.png" width="550"/>
</div>
<br>

* 기능의 구현을 담당하는 브랜치 `develop` 브랜치로 부터 생성되며 `develop` 브랜치로 `merge` 후 해당 브랜치는 삭제된다.
* `feature/{구현기능명} | feature/#issue` 으로 명칭을 준다

<br>

### `release`

<div style="text-align: center;">
<img height="295" src="https://user-
images.githubusercontent.com/54024213/143217366-0b0c9740-ef11-4451-976c-97f43d3578bc.png" width="550"/>
</div>
<br>

* 개발된 내용을 배포하기 위해 준비하는 브랜치, 해당 브랜치에서 충분한 TEST 를 통해 버그를 검사하고 수정하여 배포할 준비가 끝났다고 생각되면 `master` 로 `merge` 한다.
* `develop` 브랜치로 부터 생성되며 버그 수정 내용을 `develop` 브랜치에도 `merge` 한다.
* `release-번호` 로 브랜치명이 지정된다.

<br>

### `hotfix`

<div style="text-align: center;">
<img height="295" src="https://user-images.githubusercontent.com/54024213/143217362-27a543d8-f159-49b3-964a-9e9ac3d65dec.png" width="550"/>
</div>
<br>

* 배포된 소스에서 버그가 발생하면 생성되는 브랜치, `release` 브랜치를 거쳤음에도 발견된 버그들에 대하여 수정이 이루어진다.
* `master` 브랜치로 부터 생성되며 수정 완료 후 `develop` 브랜치. `release` 브랜치와 `master` 브랜치에 수정사항을 반영한다.

<br>

### 실행 흐름

<div style="text-align: center">
<img height="800" src="https://user-images.githubusercontent.com/54024213/143217355-c71fde39-b984-4aa8-af48-3cf90c4b062b.png"/>
</div>
**1. 신규 기능 개발**

* `develop` 으로 부터 신규 개발을 위한 `feature` 브랜치 생성

**2. Live 서버로 배포**

* QA와 TEST 를 위한 `release` 브랜치 생성 (오류 발생시 내부에서 수정)
    * -> 동기화를 위해 `develop` 에 `merge`

**3. 배포후 관리**~~~~

* `master`에서 버그 발견시 `hotfix` 브랜치 생성 -> `master` 와 `develop`에 동시화
  <br><br>

***

## Git Flow 의 장단점

### GOOD

* `feature` 브랜치는 `sourcetree / gitkraken` 같은 개발자 로컬 repo 에 저장 관리하여 타 개발자의 영향 없이 순수 개발을 진행할 수 있다.
* 브랜치를 세분화 하여 개발에 집중할 수 있도록 `merge` / 충돌 에 대비할 수 있으며 직관적인 구성이 가능하다.
* 체계적인 개발 프로세스를 통해 효율적인 테스트 환경을 구축할 수 있도록 지원한다.
* `release` 브랜치를 적용 하여 다중 버전의 배포가 가능하도록 구성할 수 잇으며, 다양한 배포 전략을 적용할 수 있다.
  <br><br>

### BAD

* 브랜치 전략의 복잡도에 따라 개발 프로세스및 릴리즈 주기가 지나치게 복잡해지고 느려질 수 있다.
* `feature` 브랜지 `merge` 및 `review` 에 많은 시간이 소모된다.
* `Git Flow `사상은 대체로 장기 프로젝트에 적합한 방식으로 민첩한 배포가 필요한 프로젝트에는 적합하지 않다.

***

## [GitLab Flow](https://scottchacon.com/2011/08/31/github-flow.html)

* `master, feature, production` 브랜치가 존재
* `issue tracking`을 연동해 프로세스르 단순화 햐여` merge request`를 통해 승인이 되는 `issue` 만 `merge` 하도록 한다.

### `feature`

* 모든 기능 구현이 되는 브랜치로 `master` 로부터 나와 기능구현후 `master` 로 `merge request`를 보낸다. 팀원간 협의 후 `master` 브랜치로 `merge` 한다.

### `master`

* Git Flow 의 develop과 같다. feature 에서 병합된 기능에 대해 TEST 하며, 이를 통한 기능이 보장 되었을 경우 production 브랜치로 merge한다.

### `production`

* Git Flow의 master와 같다. 배포 브랜치로서 안정된 소스코드가 되었을때 해당 브랜체에 병합하여 배포를 진행한다.
* 견고한 test 를 원할 경우 pre-production 브랜치를 생성해 병합전 TEST SERVER를 통해 확인할 수 있다.
* 

