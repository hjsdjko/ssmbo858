<template>
	<view class="container my-publish-pv" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
		<form>
			<view class="cu-form-group margin-top" :style='{"padding":"16rpx 24rpx","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0 0 20rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(251, 251, 251, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
				<input :style='{"padding":"0 20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(194, 228, 106, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"dashed","height":"60rpx"}' v-model="forum.title" placeholder="标题"></input>
			</view>
			<view class="cu-form-group margin-top" :style='{"padding":"16rpx 24rpx","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0 0 20rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(251, 251, 251, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
				<!-- <radio-group>
					<label class="radio">
						<radio @tap="setIsDoneTap('开放')" style="margin: 0 20upx;" value="开放" :checked="forum.isdone=='开放'" /><text>开放</text>
						<radio @tap="setIsDoneTap('关闭')" style="margin: 0 20upx;" value="关闭" :checked="forum.isdone=='关闭'" /><text>私人</text>
					</label>
				</radio-group> -->
				<picker @change="setIsDoneTap" :value="index" :range="options">
					<view class="uni-picker-type" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(194, 228, 106, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx","width":"100%","lineHeight":"60rpx","fontSize":"28rpx","borderStyle":"dashed"}'>{{options[index]}}</view>
				</picker>
			</view>
			<view class="cu-form-group margin-top" :style='{"padding":"16rpx 24rpx","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0 0 20rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(251, 251, 251, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
				<textarea :style='{"padding":"20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(194, 228, 106, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"dashed","height":"240rpx"}' style="height: 500upx;" v-model="forum.content" placeholder="内容"></textarea>
			</view>
			<view class="cu-form-group margin-top" style="text-align:center">
				<button :style='{"padding":"0 20rpx","boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","margin":"20rpx auto","borderColor":"#409EFF","backgroundColor":"rgba(194, 228, 106, 1)","color":"#fff","borderRadius":"88rpx","borderWidth":"0","width":"60%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red margin-tb-sm">确认提交</button>
			</view>
		</form>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				forum: {
					content: '',
					id: '',
					title: '',
					isdone: '开放',
					parentid: 0
				},
				index: 0,
				options: ['开放', '关闭'],
				username: '',
				user: {}
			}
		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
									                                    if(table == `yonghu`){
                this.username = this.user.yonghuzhanghao
            }
                                                                                                                                                						            			            			            			            			            			            			            			            			            			if (options.id) {
				this.id = options.id;
				let res = await this.$api.info('forum',this.id);
				this.forum = res.data
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.my-publish-pv .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.myPublishForm.content.input.backgroundColor
					// })
				})
			},
			async onSubmitTap() {
				this.forum.username = this.username;
				if (this.id) {
					await this.$api.update('forum',this.forum);
				} else {
					await this.$api.save('forum',this.forum);
				}
				this.$utils.msgBack('操作成功');
			},
			setIsDoneTap(e) {
				// this.forum.isdone = e;
				this.index = e.target.value
				this.forum.isdone = this.options[this.index]
			},
		}
	}
</script>

<style>
	page {
		background-color: #fff;
	}
	
	.container {
		padding: 20upx 24upx;
	}
	
	.container:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20220228/47377db76a254e5d9c97b5f20acfa5ea.png);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}
	
	.cu-form-group {
		padding: 0;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 60rpx;
	}
	.bg-red {
		line-height: 80rpx;
	}
</style>
