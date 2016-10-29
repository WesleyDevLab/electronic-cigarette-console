<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <jsp:include page="/WEB-INF/view/common/basecss.jsp" flush="true"/>
    <link rel="stylesheet" href="${res_url}js/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <style type="text/css">
        .text-null {
            border-color: #ff0000 !important;
        }

        .text-not-null {
            border-color: #008000 !important;
        }
    </style>
</head>

<body class="no-skin">
<div class="main-container" id="main-container">
    <script type="text/javascript">
        try {
            ace.settings.check('main-container', 'fixed')
        } catch (e) {
        }
    </script>

    <div class="main-container-inner">
        <div class="main-content" style="margin-left: 0px;">
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <form class="form-horizontal" id="validation-form" method="post">
                            <input type="hidden" name="sku" value="${sku}">
                            <table style="width: 600px" border="1">
                                <thead>
                                <tr>
                                    <td width="10%" align="center">
                                        类型
                                    </td>
                                    <td width="15%" align="center">
                                        数量1
                                    </td>
                                    <td width="15%" align="center">
                                        价格1
                                    </td>
                                    <td width="15%" align="center">
                                        数量2
                                    </td>
                                    <td width="15%" align="center">
                                        价格2
                                    </td>
                                    <td width="15%" align="center">
                                        数量3
                                    </td>
                                    <td width="15%" align="center">
                                        价格3
                                    </td>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td width="10%" align="center">
                                        类型A
                                    </td>
                                    <td>
                                        <input type="text" name="numA1" class="required" value="${numA1}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceA1" class="required" value="${priceA1}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="numA2" class="not-required" value="${numA2}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceA2" class="not-required" value="${priceA2}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="numA3" class="not-required" value="${numA3}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceA3" class="not-required" value="${priceA3}" style="width: 100%">
                                    </td>
                                </tr>
                                <tr>
                                    <td width="10%" align="center">
                                        类型B
                                    </td>
                                    <td>
                                        <input type="text" name="numB1" class="required" value="${numB1}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceB1" class="required" value="${priceB1}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="numB2" class="not-required" value="${numB2}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceB2" class="not-required" value="${priceB2}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="numB3" class="not-required" value="${numB3}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceB3" class="not-required" value="${priceB3}" style="width: 100%">
                                    </td>
                                </tr>
                                <tr>
                                    <td width="10%" align="center">
                                        类型C
                                    </td>
                                    <td>
                                        <input type="text" name="numC1" class="required" value="${numC1}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceC1" class="required" value="${priceC1}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="numC2" class="not-required" value="${numC2}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceC2" class="not-required" value="${priceC2}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="numC3" class="not-required" value="${numC3}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceC3" class="not-required" value="${priceC3}" style="width: 100%">
                                    </td>
                                </tr>
                                <tr>
                                    <td width="10%" align="center">
                                        类型D
                                    </td>
                                    <td>
                                        <input type="text" name="numD1" class="required" value="${numD1}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceD1" class="required" value="${priceD1}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="numD2" class="not-required" value="${numD2}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceD2" class="not-required" value="${priceD2}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="numD3" class="not-required" value="${numD3}" style="width: 100%">
                                    </td>
                                    <td>
                                        <input type="text" name="priceD3" class="not-required" value="${priceD3}" style="width: 100%">
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="clearfix form-actions" align="center">
                                <div class="col-md-offset-3 col-md-9">
                                    <button id="submit-btn" class="btn btn-info" type="button" data-last="Finish">
                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                        提交
                                    </button>
                                    &nbsp; &nbsp; &nbsp;
                                    <button class="btn" type="reset">
                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                        重置
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div><!-- /.main-content -->
    </div><!-- /.main-container-inner -->
</div><!-- /.main-container -->
<!-- basic scripts -->
<jsp:include page="/WEB-INF/view/common/basejs.jsp" flush="true"/>
<script src="${res_url}js/ztree/js/jquery.ztree.core-3.5.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        $('.required').each(function (index) {
            var me = $(this);
            if ($.trim(me.val()) == '') {
                me.removeClass().addClass('text-null');
            } else {
                me.removeClass().addClass('text-not-null');
            }
            me.addClass('required');
            me.on('blur', function () {
                if ($.trim(me.val()) == '') {
                    me.removeClass().addClass('text-null');
                } else {
                    me.removeClass().addClass('text-not-null');
                }
                me.addClass('required');
            });
        });

        var $btn = $("#submit-btn");
        $btn.on('click', function () {
            var me = $(this);
            if (me.hasClass("disabled")) return;

            var valid = true;
            $('.required').each(function (index) {
                if ($.trim($(this).val()) == '') {
                    valid = false;
                    return;
                }
            });
            if(!valid) {
                layer.alert("数量1或价格1不可为空!");
                return;
            }

            $('.not-required').each(function (index) {
                if ($.trim($(this).val()) == '') {
                    valid = false;
                    return;
                }
            });
            if(!valid) {
                layer.confirm("其他未设置数据量或价格的，系统将自动设置为与数量1和价格1一致",function(index){
                    layer.close(index);
                    me.addClass("disabled");
                    var postData = $('#validation-form').serializeJson();
                    $.post("${context_path}/mall/sku/saveSkuPrice", postData, function (data) {
                        if (data.code == 0) {
                            layer.msg('操作成功', {
                                icon: 1,
                                time: 2000 //2秒关闭（如果不配置，默认是3秒）
                            }, function () {
                                parent.reloadGrid();
                                var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                                parent.layer.close(index); //再执行关闭
                            });
                        }
                        $("#submit-btn").removeClass("disabled");
                    }, "json");
                });
                return;
            }
            return false;
        });

    });
</script>
</body>

</html>

